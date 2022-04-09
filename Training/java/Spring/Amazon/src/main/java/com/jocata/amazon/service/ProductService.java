package com.jocata.amazon.service;

import java.util.List;

import com.jocata.amazon.request.ProductRequest;
import com.jocata.amazon.response.ProductResponse;

public interface ProductService {
 
	  public ProductResponse getProductDetails(Integer pkId);
	  public boolean addProduct(ProductRequest productRequest);
	  public List<ProductResponse> getProductListByCatId(Integer pkId);
}
