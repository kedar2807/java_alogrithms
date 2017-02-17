package binary_search_tree.interfaces;

import binary_search_tree.models.BinaryTree;
import binary_search_tree.models.BinaryTreeNode;

/**
 * 
 * @author kedar.parikh
 * 
 * @param <E>
 */
public interface IBinaryTreeOperations<E extends Comparable<E>> {

	BinaryTree<E> makeBinaryTree(E[] sourceElements);

	void inOrderTreeWalk(BinaryTreeNode<E> rootNode);

	void preOrderTreeWalk(BinaryTreeNode<E> rootNode);

	void postOrderTreeWalk();

	E searchElement(E elementToSearch, BinaryTreeNode<E> rootNode);

	boolean deleteElement(E elementToDelete);

	void addElement(E elementToAdd, BinaryTreeNode<E> rootNode);

}
