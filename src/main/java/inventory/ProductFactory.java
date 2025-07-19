package inventory;

/**
 * Factory class for creating Product objects with business rules.
 * TODO: Implement the Factory pattern with product type validation and pricing rules.
 *
 * Requirements:
 * - Constants for product types
 * - Business rules: Books minimum $5, Electronics minimum $10
 * - Static factory method for product creation
 * - Exception handling for invalid inputs
 */
public class ProductFactory {

    // TODO: Define product type constants
    // public static final String BOOK_TYPE = "____";
    // public static final String ELECTRONICS_TYPE = "____";

    /**
     * TODO: Implement factory method to create products with business rules
     * @param id - product identifier
     * @param name - product name
     * @param type - product type (must be BOOK or ELECTRONICS)
     * @param price - product price (must meet minimum requirements)
     * @param quantity - initial stock quantity
     * @return new Product instance
     * @throws IllegalArgumentException if validation fails
     */
    public static Product createProduct(String id, String name, String type, double price, int quantity) {
        // TODO: Implement factory logic

        // Step 1: Validate product type
        // Check if type is either BOOK_TYPE or ELECTRONICS_TYPE
        // Throw IllegalArgumentException if invalid

        // Step 2: Apply business rules based on product type
        // Books: minimum price $5.00
        // Electronics: minimum price $10.00
        // Throw IllegalArgumentException with descriptive message if rules violated

        // Step 3: Create and return Product instance
        // Use Product constructor with validated parameters

        return null; // Placeholder - replace with actual implementation
    }

    // TODO: Optional - Add helper methods for validation
    // private static boolean isValidProductType(String type) { }
    // private static void validateBusinessRules(String type, double price) { }
}