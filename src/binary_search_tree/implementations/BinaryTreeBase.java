package binary_search_tree.implementations;

import binary_search_tree.interfaces.IBinaryTreeOperations;
import binary_search_tree.models.BinaryTree;
import binary_search_tree.models.BinaryTreeNode;

/**
 * 
 * @author kedar.parikh
 * 
 * @param <E>
 */
public abstract class BinaryTreeBase<E extends Comparable<E>> implements
		IBinaryTreeOperations<E> {

	public abstract BinaryTree<E> makeBinaryTree(E[] sourceElements);

	public abstract void addElement(E elementToAdd,BinaryTreeNode<E> rootNode);

	@Override
	public void inOrderTreeWalk(BinaryTreeNode<E> rootNode) {
		if (rootNode != null) {
			inOrderTreeWalk(rootNode.getLeft());
			System.out.print(rootNode.getKey() + ",");
			inOrderTreeWalk(rootNode.getRight());
		}

	}

	@Override
	public void preOrderTreeWalk(BinaryTreeNode<E> rootNode) {
		if (rootNode != null) {
			System.out.print(rootNode.getKey() + ",");
			preOrderTreeWalk(rootNode.getLeft());
			preOrderTreeWalk(rootNode.getRight());
		}
	}

	@Override
	public void postOrderTreeWalk() {

	}

	@Override
	public E searchElement(E elementToSearch, BinaryTreeNode<E> rootNode) {
		if (rootNode != null) {
			if (rootNode.getKey().equals(elementToSearch))
				return rootNode.getKey();
			else if (rootNode.getKey().compareTo(elementToSearch) < 0) {
				return searchElement(elementToSearch, rootNode.getRight());
			} else {
				return searchElement(elementToSearch, rootNode.getLeft());
			}
		}
		return null;
	}

	@Override
	public boolean deleteElement(E elementToDelete) {
		return false;
	}

}
