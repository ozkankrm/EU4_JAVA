package assignments.Assignment_14_OOP;

import java.util.ArrayList;
import java.util.List;

public class Question_14_TJMaxx {
	public static void main(String[] args) {
		
	}

}

class TJMaxx{
	
		/**
		 * Private lists to hold regular Item objects and OnSaleItem objects that
		 * represent items that sell in TJMaxx
		 */
		private static List<Item> regularItems;
		private static List<OnSaleItem> onSaleItems;

		/**
		 * Public no-args constructor - Instantiates regularItems and onSaleItems lists
		 * as new ArrayList
		 */
		public TJMaxx() {
			regularItems=new ArrayList<>();
			onSaleItems=new ArrayList<>();

		}

		/**
		 * adds an item object to regularItems list
		 * 
		 * @param item
		 */
		public static void addRegularItem(Item item) {
			regularItems.add(item);

		}

		/**
		 * adds OnSaleItem object to onSaleItems list
		 * 
		 * @param item
		 */
		public static void addOnSaleItem(OnSaleItem item) {
			onSaleItems.add(item);

		}

		/**
		 * getter for regularItems
		 * 
		 * @return
		 */
		public static List<Item> getRegularItems() {

			return regularItems;
		}

		/**
		 * getter for onSaleItems
		 * 
		 * @return
		 */
		public static List<OnSaleItem> getOnSaleItems() {

			return onSaleItems;
		}

		/**
		 * return count of regularItem object
		 * 
		 * @return
		 */
		public static int regularItemsCount() {

			return regularItems.size();
		}

		/**
		 * returns count of onSaleItems in TJ Maxx
		 * 
		 * @return
		 */
		public static int onSaleItemsCount() {

			return onSaleItems.size();
		}

		/**
		 * returns the name of each item in TJ Maxx starting from regular item then
		 * onSaleItems
		 * 
		 * @return
		 */
		public static List<String> getAllItemNames() {

			List<String> allItemName = new ArrayList<String>();

			for (Item name : regularItems) {
				allItemName.add(name.getName());
			}
			for (OnSaleItem name : onSaleItems) {
				allItemName.add(name.getName());
			}

			return allItemName;
		}

		/**
		 * gets catalog number and returns price for the item it will search for the
		 * item both regularItems and onsaleonSaleItems
		 * 
		 * @param catalogNumber
		 * @returns 0.0 if product cannot be found with that catalognumber
		 */
		public static double getItemPrice(int catalogNumber) {
			for (Item item : regularItems) {
				if (item.getCatalogNumber() == catalogNumber) {
					return item.getPrice();
				}
			}
			for (OnSaleItem item : onSaleItems) {
				if (item.getCatalogNumber() == catalogNumber) {
					return item.getPrice();
				}
			}
			return 0.0;
		}

		/**
		 * accepts a name then searches amoung onSaleItems. Once it finds, the method
		 * will return that OnSaleItem object
		 * 
		 * @param name
		 * @return
		 */
		public static OnSaleItem getOnSaleItem(String name) {
			for (OnSaleItem item : onSaleItems) {
				if (item.getName().equals(name)) {
					return item;
				}
			}

			return null;
		}

		/**
		 * removes the item with matching catalogNumber from both regularItems and
		 * onSaleItems. Does nothing if not found
		 * 
		 * @param catalogNumber
		 */
		public static void removeItem(int catalogNumber) {

			for (Item item : regularItems) {
				if (item.getCatalogNumber() == catalogNumber) {
					regularItems.remove(item);
					break;
				}
			}
			for (OnSaleItem item : onSaleItems) {
				if (item.getCatalogNumber() == catalogNumber) {
					onSaleItems.remove(item);
					break;
				}
			}

		}

		/**
		 * - it accepts a catalog number and finds that item among regularItems and
		 * onSaleItems - if it finds the item: - decrease the count of the Item by 1 -
		 * if count reaches 0 after decrementing then remove the product(call removeItem
		 * method)
		 *
		 * @param catalogNumber
		 */
		public static void buyItem(int catalogNumber) {

			for (Item item : regularItems) {
				if (item.getCatalogNumber() == catalogNumber) {
					item.setQuantity(item.getQuantity() - 1);
					if (item.getQuantity() == 0) {
						regularItems.remove(item);
					}
					break;
				}
			}
			for (OnSaleItem item : onSaleItems) {
				if (item.getCatalogNumber() == catalogNumber) {
					item.setQuantity(item.getQuantity() - 1);
					if (item.getQuantity() == 0) {
						onSaleItems.remove(item);
					}
					break;
				}
			}
		}
	}



		


