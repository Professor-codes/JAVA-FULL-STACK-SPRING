package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.ProductBean;

@Controller
public class ProductController {

    @GetMapping("/addproduct")
    public String addProductPage() {
        return "addProduct";
    }

    @PostMapping("/saveproduct")
    public String saveProduct(ProductBean productBean, Model model) {

        boolean isError = false;

        String productNameRegex = "[a-zA-Z0-9\\s]+";
        String productCategoryRegex = "[a-zA-Z]+";
        String productQuantityRegex = "[0-9]+";
        String productPriceRegex = "[0-9]+";

        model.addAttribute("productBean", productBean);

        // validation
        if (productBean.getProductName() == null || productBean.getProductName().trim().length() == 0) {
            isError = true;
            model.addAttribute("productNameError", "Enter product name to continue.");
        } else if (!productBean.getProductName().matches(productNameRegex)) {
            isError = true;
            model.addAttribute("productNameError", "Enter valid product name.");
        } else {
            // model.addAttribute("productNameValue", productBean.getProductName());
        }

        if (productBean.getProductCategory() == null || productBean.getProductCategory().trim().length() == 0) {
            isError = true;
            model.addAttribute("productCategoryError", "Enter product category to continue.");
        } else if (!productBean.getProductCategory().matches(productCategoryRegex)) {
            isError = true;
            model.addAttribute("productCategoryError", "Enter valid product category.");
        } else {
            // model.addAttribute("productCategoryValue", productBean.getProductCategory());
        }

        if (productBean.getProductQuantity() == null || productBean.getProductQuantity() == 0) {
            isError = true;
            model.addAttribute("productQuantityError", "Enter product quantity to continue.");
        } else if (productBean.getProductQuantity().toString().matches(productQuantityRegex)==false) {
            isError = true;
            model.addAttribute("productQuantityError", "Enter valid product quantity.");
        } else {
            // model.addAttribute("productQuantityValue", productBean.getProductQuantity());
        }

        // PRICE
        if (productBean.getProductPrice() == null || productBean.getProductPrice() == 0) {
            isError = true;
            model.addAttribute("productPriceError", "Enter product price to continue.");
        } else if (!productBean.getProductPrice().toString().matches(productPriceRegex)) {
            isError = true;
            model.addAttribute("productPriceError", "Enter valid product price.");
        } else {
            // model.addAttribute("productPriceValue", productBean.getProductPrice());
        }

        if (isError) {
            return "addProduct";
        } else {
            return "home";
        }

        // return "home";
    }
}
