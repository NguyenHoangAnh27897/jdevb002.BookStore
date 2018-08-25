/*
 * ClassName" ConvertUtils
 * Version information: 1.0
 * Date: 10/6/2017
 * Copyright
 */
package jvb002.bookstore.app.util;

import java.util.ArrayList;
import java.util.List;

import jvb002.bookstore.app.dto.CategoryVO;
import jvb002.bookstore.app.dto.PublisherVO;
import jvb002.bookstore.app.dto.UserVO;
import jvb002.bookstore.app.model.classification.Category;
import jvb002.bookstore.app.model.publishermanagement.Publisher;
import jvb002.bookstore.app.model.usermanagement.User;

/**
 * @author User
 *
 */
public class ConvertUtils {
	/**
	 * Convert BookVO to Book
	 * 
	 * @param bookVo
	 * @return object Book
	 */
	public static void convertBookVOToBook() {

	}

	/**
	 * Convert Book to BookVO
	 * 
	 * @param book
	 * @return object BookVO
	 */
	public static void convertBookToBookVO() {
		// TODDO
	}

	/**
	 * Convert UserVOToUse
	 * 
	 * @param UserVO
	 * @return object Use
	 */
	public static User convertUserVOToUser(UserVO userVO) {
		User user = new User();
		user.setUserName(userVO.getUserName());
		user.setPassword(userVO.getPassword());
		user.setRole(userVO.getRole());
		user.setFullName(userVO.getFullName());
		user.setCreatedUserId(1);
		user.setCreatedDate("2018-08-08 00:00:00");
		return user;
	}

	/**
	 * Convert UserToUseVO
	 * 
	 * @param User
	 * @return object UseVO
	 */
	public static UserVO convertUserToUserVO(User user) {
		UserVO userVO = new UserVO();
		return userVO;
	}
	
	public static  Publisher convertPublisherVOToPublisher(PublisherVO publisherVO) {
		Publisher publisher = new Publisher();
		publisher.setName(publisherVO.getName());
		publisher.setDescription(publisherVO.getDescription());
		publisher.setCreatedDate(publisherVO.getCreatedDate());
		publisher.setCreatedUserID(publisherVO.getCreatedUserID());
		return publisher;
	}
	
	public static PublisherVO convertPublisherToPublisherVO(Publisher publisher) {
		PublisherVO publisherVO = new PublisherVO();
		publisherVO.setName(publisher.getName());
		publisherVO.setDescription(publisher.getDescription());
		publisherVO.setCreatedDate(publisher.getCreatedDate());
		publisherVO.setCreatedUserID(publisher.getCreatedUserID());
		return publisherVO;
	}
	
	
	//-----------------------
	/**
	 * Convert UserVOToUse
	 * 
	 * @param UserVO
	 * @return object Use
	 */
	public static Category convertCategoryVOToCategory(CategoryVO categoryVO) {
		Category category = new Category();
		category.setCategoryID(categoryVO.getCategoryID());
		category.setName(categoryVO.getName());
		category.setDescription(categoryVO.getDescription());
		category.setCategory_parentID(categoryVO.getCategory_parentID());
		category.setCreated_date(categoryVO.getCreated_date());
		category.setCreated_userID(categoryVO.getCreated_userID());
//		category.setBook(book);(userVO.getCreatedUserId());
		
		return category;
	}

	/**
	 * Convert UserToUseVO
	 * 
	 * @param User
	 * @return object UseVO
	 */
	public static CategoryVO convertCategoryToCategoryVO(Category category) {
		CategoryVO categoryVO = new CategoryVO();
		categoryVO.setCategoryID(category.getCategoryID());
		categoryVO.setName(category.getName());
		categoryVO.setDescription(category.getDescription());
		categoryVO.setCategory_parentID(category.getCategory_parentID());
		categoryVO.setCreated_date(category.getCreated_date());
		categoryVO.setCreated_userID(category.getCreated_userID());
		return categoryVO;
	}
	
	@SuppressWarnings("null")
	public static List<CategoryVO> ListCategoryVO(List<Category> categories) {
		List<CategoryVO> listCategoryVO = new  ArrayList<CategoryVO>();
			for (Category category : categories) {
				listCategoryVO.add(convertCategoryToCategoryVO(category));
			}
		return listCategoryVO.size() >0 ? listCategoryVO : null;
	}
}
