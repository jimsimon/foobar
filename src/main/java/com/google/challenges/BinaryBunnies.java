package com.google.challenges;

import java.math.BigInteger;

public class BinaryBunnies {
    public static String answer(int[] seq) {
        BinarySearchTree bst = new BinarySearchTree();
        for (Integer value : seq) {
            Node node = new Node(value);
            bst.insert(node);
        }

        return getNumberOfPossibleSequences(bst.getRoot()).toString();
    }

    private static BigInteger getNumberOfPossibleSequences(Node node) {
        if (node == null) {
            return BigInteger.ONE;
        }

        int totalNodesInLeftSubtree = count(node.left);
        int totalNodesInRightSubtree = count(node.right);

        BigInteger totalPermutationsInLeftSubTree = getNumberOfPossibleSequences(node.left);
        BigInteger totalPermutationsInRightSubTree = getNumberOfPossibleSequences(node.right);

        return choose(totalNodesInLeftSubtree + totalNodesInRightSubtree, totalNodesInRightSubtree).multiply(totalPermutationsInLeftSubTree).multiply(totalPermutationsInRightSubTree);
    }

    private static int count(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + count(node.left) + count(node.right);
    }

    private static BigInteger choose(int n, int k) {
        BigInteger denominator = factorial(k).multiply(factorial(n - k));
        return factorial(n).divide(denominator);
    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i=1; i<=n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    static class BinarySearchTree {
        private Node root;

        public Node getRoot() {
            return root;
        }

        public void insert(Node node) {
            root = insert(root, node);
        }

        private Node insert(Node currentNode, Node newNode) {
            if (currentNode == null) {
                return newNode;
            } else if (newNode.value > currentNode.value) {
                currentNode.left = insert(currentNode.left, newNode);
            } else {
                currentNode.right = insert(currentNode.right, newNode);
            }
            return currentNode;
        }
    }

    static class Node {
        private Integer value;
        private Node left;
        private Node right;

        public Node(Integer value) {
            this.value = value;
        }
    }
}
