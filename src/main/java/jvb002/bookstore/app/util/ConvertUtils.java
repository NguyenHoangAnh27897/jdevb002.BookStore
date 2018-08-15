/*
 * ClassName" ConvertUtils
 * Version information: 1.0
 * Date: 10/6/2017
 * Copyright
 */
package jvb002.bookstore.app.util;

import jvb002.bookstore.app.dto.PublisherVO;
import jvb002.bookstore.app.dto.UserVO;
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
		user.setCreatedUserId(userVO.getCreatedUserId());
		user.setCreatedDate(userVO.getCreatedDate());
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
}
