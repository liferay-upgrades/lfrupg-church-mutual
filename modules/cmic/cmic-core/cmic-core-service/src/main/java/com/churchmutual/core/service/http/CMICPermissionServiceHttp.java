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

package com.churchmutual.core.service.http;

import com.churchmutual.core.service.CMICPermissionServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>CMICPermissionServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Kayleen Lim
 * @see CMICPermissionServiceSoap
 * @generated
 */
public class CMICPermissionServiceHttp {

	public static void addDefaultPermissions(
			HttpPrincipal httpPrincipal,
			com.churchmutual.core.model.CMICBusinessKey cmicBusinessKey)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CMICPermissionServiceUtil.class, "addDefaultPermissions",
				_addDefaultPermissionsParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, cmicBusinessKey);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void addOwnerPermissions(
			HttpPrincipal httpPrincipal,
			com.churchmutual.core.model.CMICBusinessKey cmicBusinessKey)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CMICPermissionServiceUtil.class, "addOwnerPermissions",
				_addOwnerPermissionsParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, cmicBusinessKey);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.churchmutual.core.model.CMICPermission addPermission(
			HttpPrincipal httpPrincipal,
			com.churchmutual.core.model.CMICBusinessKey cmicBusinessKey,
			String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CMICPermissionServiceUtil.class, "addPermission",
				_addPermissionParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, cmicBusinessKey, actionId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (com.churchmutual.core.model.CMICPermission)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void checkPermission(
			HttpPrincipal httpPrincipal,
			com.churchmutual.core.model.CMICBusinessKey cmicBusinessKey,
			String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CMICPermissionServiceUtil.class, "checkPermission",
				_checkPermissionParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, cmicBusinessKey, actionId);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void deletePermission(
			HttpPrincipal httpPrincipal,
			com.churchmutual.core.model.CMICBusinessKey cmicBusinessKey,
			String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CMICPermissionServiceUtil.class, "deletePermission",
				_deletePermissionParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, cmicBusinessKey, actionId);

			try {
				TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static boolean hasPermission(
			HttpPrincipal httpPrincipal,
			com.churchmutual.core.model.CMICBusinessKey cmicBusinessKey,
			String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CMICPermissionServiceUtil.class, "hasPermission",
				_hasPermissionParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, cmicBusinessKey, actionId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return ((Boolean)returnObj).booleanValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static boolean hasPermission(
			HttpPrincipal httpPrincipal, String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				CMICPermissionServiceUtil.class, "hasPermission",
				_hasPermissionParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, actionId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return ((Boolean)returnObj).booleanValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		CMICPermissionServiceHttp.class);

	private static final Class<?>[] _addDefaultPermissionsParameterTypes0 =
		new Class[] {com.churchmutual.core.model.CMICBusinessKey.class};
	private static final Class<?>[] _addOwnerPermissionsParameterTypes1 =
		new Class[] {com.churchmutual.core.model.CMICBusinessKey.class};
	private static final Class<?>[] _addPermissionParameterTypes2 =
		new Class[] {
			com.churchmutual.core.model.CMICBusinessKey.class, String.class
		};
	private static final Class<?>[] _checkPermissionParameterTypes3 =
		new Class[] {
			com.churchmutual.core.model.CMICBusinessKey.class, String.class
		};
	private static final Class<?>[] _deletePermissionParameterTypes4 =
		new Class[] {
			com.churchmutual.core.model.CMICBusinessKey.class, String.class
		};
	private static final Class<?>[] _hasPermissionParameterTypes5 =
		new Class[] {
			com.churchmutual.core.model.CMICBusinessKey.class, String.class
		};
	private static final Class<?>[] _hasPermissionParameterTypes6 =
		new Class[] {String.class};

}