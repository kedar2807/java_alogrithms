package binary_search_tree.implementations.unbalanced;

import binary_search_tree.implementations.BinaryTreeBase;
import binary_search_tree.models.BinaryTree;
import binary_search_tree.models.BinaryTreeNode;

/**
 * 
 * @author kedar.parikh
 * 
 * @param <E>
 */
public class UnbalancedBinaryTree<E extends Comparable<E>> extends
		BinaryTreeBase<E> {

	@Override
	public BinaryTree<E> makeBinaryTree(E[] sourceElements) {
		BinaryTreeNode<E> treeRoot = null;
		for (E element : sourceElements) {
			BinaryTreeNode<E> currentBinaryTreeNode = new BinaryTreeNode<E>(
					element);
			if (treeRoot == null) {
				treeRoot = currentBinaryTreeNode;
			} else {
				traverseTreeAndSetElements(treeRoot, currentBinaryTreeNode);
			}

		}
		return new BinaryTree<>(treeRoot);
	}

	private void traverseTreeAndSetElements(BinaryTreeNode<E> parentNode,
			BinaryTreeNode<E> sourceElement) {

		if (parentNode.getKey() != null && sourceElement.getKey() != null
				&& sourceElement.getKey().compareTo(parentNode.getKey()) < 0) {
			if (parentNode.getLeft() == null) {
				parentNode.setLeft(sourceElement);
				sourceElement.setParent(parentNode);
			} else {
				traverseTreeAndSetElements(parentNode.getLeft(), sourceElement);
			}

		} else if (parentNode.getKey() != null
				&& sourceElement.getKey() != null
				&& parentNode.getKey().compareTo(sourceElement.getKey()) < 0) {
			if (parentNode.getRight() == null) {
				parentNode.setRight(sourceElement);
				sourceElement.setParent(parentNode);
			} else {
				traverseTreeAndSetElements(parentNode.getRight(), sourceElement);
			}
		}
	}

	@Override
	public void addElement(E elementToAdd, BinaryTreeNode<E> rootNode) {
		BinaryTreeNode<E> binaryTreeNodeToAdd = new BinaryTreeNode<>(
				elementToAdd);
		traverseTreeAndSetElements(rootNode, binaryTreeNodeToAdd);
	}

}
