package com.listcreative.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.listcreative.dto.ProductRequestDTO;
import com.listcreative.dto.ProductResponseDTO;
import com.listcreative.entity.Product;

public class ValueMapper {

    public static Product convertToEntity(ProductRequestDTO productRequestDTO) {
        Product product = new Product();
        product.setName(productRequestDTO.getName());
        product.setDescription(productRequestDTO.getDescription());
        product.setProductType(productRequestDTO.getProductType());
        product.setQuantity(productRequestDTO.getQuantity());
        product.setPrice(productRequestDTO.getPrice());
        product.setSupplierName(productRequestDTO.getSupplierName());
        product.setSupplierCode(productRequestDTO.getSupplierCode());
        return product;
    }

    public static ProductResponseDTO convertToDTO(Product product){
        ProductResponseDTO productResponseDTO = new ProductResponseDTO();
        productResponseDTO.setId(product.getId());
        productResponseDTO.setName(product.getName());
        productResponseDTO.setDesc(product.getDescription());
        productResponseDTO.setProductType(product.getProductType());
        productResponseDTO.setQuantity(product.getQuantity());
        productResponseDTO.setPrice(product.getPrice());
        productResponseDTO.setSupplierName(product.getSupplierName());
        productResponseDTO.setSupplierCode(product.getSupplierCode());
        return productResponseDTO;
    }


    public static String jsonAsString(Object obj){
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
