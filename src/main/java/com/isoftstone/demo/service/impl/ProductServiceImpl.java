package com.isoftstone.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.isoftstone.demo.common.ProductVo;
import com.isoftstone.demo.dao.ProductDao;
import com.isoftstone.demo.pojo.Product;
import com.isoftstone.demo.pojo.WareHouseProduct;
import com.isoftstone.demo.service.ProductService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.List;


@SuppressWarnings("ALL")
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao productDao;

	@Override
	public List<WareHouseProduct> findAllProducts() throws Exception {
		return productDao.findAll();
	}


	@Override
	public void addProduct(WareHouseProduct product) throws Exception {
		productDao.insert(product);
	}



	@Override
	public void delProduct(int pid) throws Exception {
       productDao.delete(pid);		
	}


	@Override
	public void updateProduct(WareHouseProduct product, MultipartFile pimage,String rootPath) throws Exception {
        //ͼƬ�ϴ�
		System.out.println(rootPath);
	    String originalFilename = pimage.getOriginalFilename();
	    File parent = new File(rootPath);
	    pimage.transferTo(new File(parent,originalFilename));
		WareHouseProduct old = productDao.findOne(product.getId());
	    BeanUtils.copyProperties(old, product);
//	    product.setPimage("/upload/"+originalFilename);
	    productDao.update(product);
	}

	/**
	 * 判断库存是否还满足订单
	 * @param id
	 * @param need
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean checkNum(int id,int need) throws Exception {
		WareHouseProduct product = productDao.findOne(id);
		if(product.getRemainNumber() >= need){
			return true;
		}else {
			return false;
		}
	}

	/**
	 * 减少库存
	 * @param id
	 * @param need
	 * @throws Exception
	 */
	@Override
	public void decNum(int id, int need) throws Exception {
		WareHouseProduct product = productDao.findOne(id);
		if(checkNum(id,need)){
			product.setRemainNumber(product.getRemainNumber() - need);
			productDao.update(product);
		}
	}

	@Override
	public Product findOneOrderProduct(int id) throws Exception {
		return productDao.findOrderOne(id);
	}

	@Override
	public List<Product> findAllOrderProduct() throws Exception {
		List<Product> res = productDao.findOrderAll();
		return res;
	}


	@Override
	public void delOrderProduct(int pid) throws Exception {
		productDao.deleteOrderProduct(pid);
	}

	@Override
	public void updateOrderProduct(Product product) throws Exception {
		productDao.updateOderProduct(product);
	}


}
