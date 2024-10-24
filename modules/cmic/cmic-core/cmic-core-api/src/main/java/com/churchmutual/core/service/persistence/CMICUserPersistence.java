/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.churchmutual.core.service.persistence;

import com.churchmutual.core.exception.NoSuchCMICUserException;
import com.churchmutual.core.model.CMICUser;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cmic user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Kayleen Lim
 * @see CMICUserUtil
 * @generated
 */
@ProviderType
public interface CMICUserPersistence extends BasePersistence<CMICUser> {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CMICUserUtil} to access the cmic user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the cmic user where userId = &#63; or throws a <code>NoSuchCMICUserException</code> if it could not be found.
	 *
	 * @param userId the user ID
	 * @return the matching cmic user
	 * @throws NoSuchCMICUserException if a matching cmic user could not be found
	 */
	public CMICUser findByUserId(long userId) throws NoSuchCMICUserException;

	/**
	 * Returns the cmic user where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @return the matching cmic user, or <code>null</code> if a matching cmic user could not be found
	 */
	public CMICUser fetchByUserId(long userId);

	/**
	 * Returns the cmic user where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cmic user, or <code>null</code> if a matching cmic user could not be found
	 */
	public CMICUser fetchByUserId(long userId, boolean useFinderCache);

	/**
	 * Removes the cmic user where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @return the cmic user that was removed
	 */
	public CMICUser removeByUserId(long userId) throws NoSuchCMICUserException;

	/**
	 * Returns the number of cmic users where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching cmic users
	 */
	public int countByUserId(long userId);

	/**
	 * Caches the cmic user in the entity cache if it is enabled.
	 *
	 * @param cmicUser the cmic user
	 */
	public void cacheResult(CMICUser cmicUser);

	/**
	 * Caches the cmic users in the entity cache if it is enabled.
	 *
	 * @param cmicUsers the cmic users
	 */
	public void cacheResult(java.util.List<CMICUser> cmicUsers);

	/**
	 * Creates a new cmic user with the primary key. Does not add the cmic user to the database.
	 *
	 * @param cmicUserId the primary key for the new cmic user
	 * @return the new cmic user
	 */
	public CMICUser create(long cmicUserId);

	/**
	 * Removes the cmic user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cmicUserId the primary key of the cmic user
	 * @return the cmic user that was removed
	 * @throws NoSuchCMICUserException if a cmic user with the primary key could not be found
	 */
	public CMICUser remove(long cmicUserId) throws NoSuchCMICUserException;

	public CMICUser updateImpl(CMICUser cmicUser);

	/**
	 * Returns the cmic user with the primary key or throws a <code>NoSuchCMICUserException</code> if it could not be found.
	 *
	 * @param cmicUserId the primary key of the cmic user
	 * @return the cmic user
	 * @throws NoSuchCMICUserException if a cmic user with the primary key could not be found
	 */
	public CMICUser findByPrimaryKey(long cmicUserId)
		throws NoSuchCMICUserException;

	/**
	 * Returns the cmic user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cmicUserId the primary key of the cmic user
	 * @return the cmic user, or <code>null</code> if a cmic user with the primary key could not be found
	 */
	public CMICUser fetchByPrimaryKey(long cmicUserId);

	/**
	 * Returns all the cmic users.
	 *
	 * @return the cmic users
	 */
	public java.util.List<CMICUser> findAll();

	/**
	 * Returns a range of all the cmic users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CMICUserModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cmic users
	 * @param end the upper bound of the range of cmic users (not inclusive)
	 * @return the range of cmic users
	 */
	public java.util.List<CMICUser> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the cmic users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CMICUserModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cmic users
	 * @param end the upper bound of the range of cmic users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cmic users
	 */
	public java.util.List<CMICUser> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CMICUser>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cmic users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CMICUserModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cmic users
	 * @param end the upper bound of the range of cmic users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cmic users
	 */
	public java.util.List<CMICUser> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CMICUser>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cmic users from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cmic users.
	 *
	 * @return the number of cmic users
	 */
	public int countAll();

}