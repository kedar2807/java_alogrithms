package binary_search_tree.models;

/**
 * 
 * @author kedar.parikh
 * 
 * @param <E>
 */
public class BinaryTree<E extends Comparable<E>> {
	private BinaryTreeNode<E> rootNode;

	public BinaryTree(BinaryTreeNode<E> rootNode) {
		this.rootNode = rootNode;
	}

	public BinaryTreeNode<E> getRootNode() {
		return rootNode;
	}

	public void setRootNode(BinaryTreeNode<E> rootNode) {
		this.rootNode = rootNode;
	}

}
