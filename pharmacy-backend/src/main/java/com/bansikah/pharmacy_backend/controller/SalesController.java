package com.bansikah.pharmacy_backend.controller;

import com.bansikah.pharmacy_backend.domain.ReceiptResponse;
import com.bansikah.pharmacy_backend.domain.Sales;
import com.bansikah.pharmacy_backend.domain.SalesItem;
import com.bansikah.pharmacy_backend.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sales")
public class SalesController {

    @Autowired
    private SalesService salesService;

    @PostMapping
    public Sales save(@RequestBody Sales sales) {
        return salesService.save(sales);
    }

    @GetMapping
    public List<Sales> findAll() {
        return salesService.findAll();
    }

    @GetMapping("/{id}")
    public Sales findById(@PathVariable Long id) {
        return salesService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        salesService.deleteById(id);
    }

    /**
     * Retrieves the detailed sales items associated with a specific sales record.
     *
     * @param id The unique identifier of the sales record.
     * @return A list of sales items associated with the given sales record.
     *         Returns {@code null} if the sales record is not found.
     */
    @GetMapping("/{id}/details")
    public ReceiptResponse getSalesDetails(@PathVariable Long id) {
        Sales sales = salesService.findById(id);
        if (sales != null) {
            List<SalesItem> salesItems = sales.getSalesItems();
            double totalAmount = 0;

            for (SalesItem item : salesItems) {
                totalAmount += item.getQuantity() * item.getPrice();
            }

            // Create and return the receipt
            ReceiptResponse receipt = new ReceiptResponse();
            receipt.setSalesItems(salesItems);
            receipt.setTotalAmount(totalAmount);

            return receipt;
        }
        return null;  // Handle case where sales record is not found
    }
}