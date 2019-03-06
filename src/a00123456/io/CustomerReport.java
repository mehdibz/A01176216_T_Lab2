/**
 * Project: A00123456Lab2
 * File: CustomerReport.java
 * Copyright 2017 Sam Cirka. All rights reserved.
 */

package a00123456.io;

import a00123456.data.Customer;

/**
 * Create a customer report.
 * 
 * @author Sam Cirka, A00123456
 *
 */
public class CustomerReport {

	public static final String HORIZONTAL_LINE = "----------------------------------------------------------------------------------------------------------------------------------";
	public static final String HEADER_FORMAT = "%3s. %-6s %-12s %-12s %-25s %-12s %-12s %-15s %-20s%n";
	public static final String CUSTOMER_FORMAT = "%3d. %06d %-12s %-12s %-25s %-12s %-12s %-15s %-20s%n";

	/**
	 * private constructor to prevent instantiation
	 */
	private CustomerReport() {
	}

	/**
	 * Write the report.
	 * 
	 * @param customers
	 *          the customers
	 */
	public static void write(Customer[] customers) {
		System.out.println();
		System.out.println("Customer Report");
		System.out.println(HORIZONTAL_LINE);
		System.out.format(HEADER_FORMAT, "#", "ID", "First name", "Last name", "Street", "City", "Postal Code", "Phone", "Email");
		System.out.println(HORIZONTAL_LINE);
		int i = 0;
		for (Customer customer : customers) {
			System.out.format(CUSTOMER_FORMAT, ++i, customer.getId(), customer.getFirstName(), customer.getLastName(), customer.getStreet(),
					customer.getCity(), customer.getPostalCode(), customer.getPhone(), customer.getEmailAddress());
		}
	}
}
