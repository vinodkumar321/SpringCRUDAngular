package com.jocata.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jocata.config.SpringMVCContext;
import com.jocata.model.Category;
import com.jocata.model.Product;
import com.jocata.util.ServiceManager;

@Controller
public class ProductController {
	@Autowired
	ServiceManager serviceManager;
	
	@GetMapping("/getProduct")
	public ModelAndView getCategory(@RequestParam("pid") Integer pid) {
		ModelAndView mv = new ModelAndView("productList");
		Product product = (Product) serviceManager.getProductService().getProduct(pid);
		mv.addObject("pName", product.getpName());
		Category category = (Category) serviceManager.getCategoryService().getCategory(product.getCatId());
		mv.addObject("catName", category.getCatName());
		mv.addObject("price", product.getPrice());
		mv.addObject("quantity", product.getQuantity());
		mv.addObject("description", product.getDescription());
		return mv;
	}
	
	  @GetMapping("/addProductForm")
	  public ModelAndView addProduct(){
			List<Product> productList = serviceManager.getProductService().getProductList();
			ModelAndView mv = new ModelAndView("addProduct");
			mv.addObject("productList", productList);
			return mv;
	     }
	 
		@PostMapping("/saveProduct")
		public ModelAndView saveProduct(HttpServletRequest request, 
										@RequestParam("pName")String pName,@RequestParam("catId")Integer catId,@RequestParam("price")Integer price,@RequestParam("quantity")Integer quantity,@RequestParam("description") String description)
		{
			ModelAndView mv = new ModelAndView("addProduct");
			
			Product product = (Product) SpringMVCContext.getApplicationContext().getBean("product");
			product.setpName(pName);  //this is using RequestParam variable
			product.setCatId(catId);
			product.setPrice(price);
			product.setQuantity(quantity);
			product.setDescription(description);
			
			product = serviceManager.getProductService().saveProduct(product);
			List<Product> productList = serviceManager.getProductService().getProductList();
			mv.addObject("productList", productList);
			
			return mv;		
		} 
	  
	   
}
