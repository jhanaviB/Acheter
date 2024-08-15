package com.ecommerce.controller;

import com.ecommerce.dto.InventoryResponse;
import com.ecommerce.service.InventoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller for handling inventory-related requests.
 */
@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    private static final Logger logger = LoggerFactory.getLogger(InventoryController.class);

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    /**
     * Checks the stock availability for a list of SKU codes.
     *
     * @param skuCodes List of SKU codes to check inventory for
     * @return List of InventoryResponse indicating stock availability
     */
    // http://localhost:8082/api/inventory/iphone-13,iphone13-red

    // http://localhost:8082/api/inventory?skuCode=iphone-13&skuCode=iphone13-red
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> checkStockAvailability(@RequestParam List<String> skuCodes) {
        logger.info("Received inventory check request for SKU codes: {}", skuCodes);
        return inventoryService.isInStock(skuCodes);
    }
}
