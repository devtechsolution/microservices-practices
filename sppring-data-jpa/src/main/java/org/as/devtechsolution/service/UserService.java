package org.as.devtechsolution.service;

import java.util.List;

import org.as.devtechsolution.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;

public interface UserService {

	List<User> findAllUsers();

	User findUserByName(Long id);

	void addUser(User user);

	void deleteUserById(Long id);

	List<User> getAllUserByFirstName(String firstName);

	List<User> getUsersByGender(String gender1);

	void updateAddress(Long id, String newAdress);

	List<User> findSortedUsers(String paramForSorting);

	List<User> getUsersByGenderAndSort(String gender1, String sortingParam);

	Page<User> getAllUsersByPages(int pageNumber, int numberOfElementsPerPage);

	Slice<User> getAllUsersBySlices(int pageNumber, int numberOfElementsPerPage);

}