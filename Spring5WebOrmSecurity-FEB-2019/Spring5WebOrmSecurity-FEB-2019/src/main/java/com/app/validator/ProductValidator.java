package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.Product;

@Component
public class ProductValidator implements Validator{

	@Override
	public boolean supports(Class<?> clz) {
		return Product.class.equals(clz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		//Model class obj - Form Data
		Product p=(Product)target;
		
		if(p.getProdName()==null || "".equals(p.getProdName().trim())) {
			errors.rejectValue("prodName", null, "Please provide Product Name");
		}else if(!Pattern.compile("[A-Z]{2,4}").matcher(p.getProdName()).matches()) {
			errors.rejectValue("prodName", null, "Name must be 2-4 Uppercase letters");
		}
		
		if(p.getProdCode()==null || "".equals(p.getProdCode().trim())) {
			errors.rejectValue("prodCode", null, "Please Enter any code");
		}else if(!Pattern.compile("[A-Z]{4,6}").matcher(p.getProdCode()).matches()) {
			errors.rejectValue("prodCode", null, "Code must be 4-6 Uppercase only");
		}
		
		if(p.getProdCost()==null || p.getProdCost()<=0) {
			errors.rejectValue("prodCost", null, "Please Enter Valid cost");
		}
		
	}

}
