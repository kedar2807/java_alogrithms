package binary_search_tree.models;

public class BinaryTreeNode<E extends Comparable<E>>{

	private BinaryTreeNode<E> parent;
	private BinaryTreeNode<E> left;
	private BinaryTreeNode<E> right;
	private E key;

	public BinaryTreeNode(E key) {
		this.key = key;
	}

	public BinaryTreeNode<E> getParent() {
		return parent;
	}

	public void setParent(BinaryTreeNode<E> parent) {
		this.parent = parent;
	}

	public BinaryTreeNode<E> getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode<E> left) {
		this.left = left;
	}

	public BinaryTreeNode<E> getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode<E> right) {
		this.right = right;
	}

	public E getKey() {
		return key;
	}

	public void setKey(E key) {
		this.key = key;
	}


}
