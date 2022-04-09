package com.jocata.amazon.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.jocata.amazon.dao.ProductDAO;
import com.jocata.amazon.dao.impl.Product;
import com.jocata.amazon.dao.impl.ProductDAOImpl;
import com.jocata.amazon.request.ProductRequest;
import com.jocata.amazon.response.ProductResponse;
import com.jocata.amazon.service.ProductService;
import com.jocata.amazon.util.AmazonBeanFactory;

public class ProductServiceImpl implements ProductService {

	public ProductResponse getProductDetails(Integer pkId) {
		ProductDAO productDAO = (ProductDAOImpl)AmazonBeanFactory.getBean("productDAO");
		Product product =(Product) productDAO.get(pkId);
		ProductResponse productResponse = (ProductResponse)AmazonBeanFactory.getBean("productResponse");
		if(product != null) {
			productResponse.setId(product.getId());
			productResponse.setCatId(product.getCatId());
			productResponse.setPname(product.getPname());
			productResponse.setPrice(product.getPrice());
			productResponse.setQuantity(product.getQuantity());
			productResponse.setDescription(product.getDescription());
		}
		
		return productResponse;
	}

	public List<ProductResponse> getProductListByCatId(Integer catId) {
		ProductDAO productDAO = (ProductDAOImpl)AmazonBeanFactory.getBean("productDAO");
		List<Object> productList = productDAO.list();
		List<ProductResponse> productResponse = new ArrayList<>();
		
		if(productList != null && productList.size() > 0) {
			
			  for(Object obj:productList) {
				  Product product = (Product) obj;
				  ProductResponse productRes = (ProductResponse)AmazonBeanFactory.getBean("productResponse");
				if(product.getCatId() == catId ) {  
					  productRes.setId(product.getId());
					  productRes.setCatId(product.getCatId());
					  productRes.setPname(product.getPname());
					  productRes.setPrice(product.getPrice());
					  productRes.setQuantity(product.getQuantity());
					  productRes.setDescription(product.getDescription());
					  productResponse.add(productRes);
				    } 
			  }
		}
		return productResponse;
	}

	public boolean addProduct(ProductRequest productRequest) {
	    ProductDAO productDAO = (ProductDAOImpl)AmazonBeanFactory.getBean("productDAO");
	    Product product = (Product)AmazonBeanFactory.getBean("product");
	    product.setCatId(productRequest.getCatId());
	    product.setPname(productRequest.getProductName());
	    product.setPrice(productRequest.getProductPrice());
	    product.setQuantity(productRequest.getProductQuantity());
	    product.setDescription(productRequest.getProductDescription());
		return productDAO.save(product);
	}

}
