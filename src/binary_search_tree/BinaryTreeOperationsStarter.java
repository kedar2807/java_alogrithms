package binary_search_tree;

import binary_search_tree.implementations.unbalanced.UnbalancedBinaryTree;
import binary_search_tree.interfaces.IBinaryTreeOperations;
import binary_search_tree.models.BinaryTree;
/**
 * 
 * @author kedar.parikh
 *
 */
public class BinaryTreeOperationsStarter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IBinaryTreeOperations<Integer> binaryOperations = new UnbalancedBinaryTree<>();
		int numberToFind = 10;
		Integer[] numbersToAddInBinary = { 5, 3, 4, 6, 2, 10 };
		BinaryTree<Integer> binaryTree = binaryOperations
				.makeBinaryTree(numbersToAddInBinary);
		 binaryOperations.inOrderTreeWalk(binaryTree.getRootNode());
		 binaryOperations.preOrderTreeWalk(binaryTree.getRootNode());
		binaryOperations.addElement(8, binaryTree.getRootNode());
		System.out.println("binary tree number found => "
				+ binaryOperations.searchElement(numberToFind, binaryTree.getRootNode()));


	}

}
