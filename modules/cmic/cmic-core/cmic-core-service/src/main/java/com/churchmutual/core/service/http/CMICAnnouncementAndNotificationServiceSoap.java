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

import com.churchmutual.core.service.CMICAnnouncementAndNotificationServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>CMICAnnouncementAndNotificationServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Kayleen Lim
 * @see CMICAnnouncementAndNotificationServiceHttp
 * @generated
 */
public class CMICAnnouncementAndNotificationServiceSoap {

	public static void deleteNotification(long userNotificationEventId)
		throws RemoteException {

		try {
			CMICAnnouncementAndNotificationServiceUtil.deleteNotification(
				userNotificationEventId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void dismissAnnouncement(long announcementEntryId)
		throws RemoteException {

		try {
			CMICAnnouncementAndNotificationServiceUtil.dismissAnnouncement(
				announcementEntryId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.churchmutual.core.model.CMICAnnouncementDisplay[]
			getAnnouncementDisplays()
		throws RemoteException {

		try {
			java.util.List<com.churchmutual.core.model.CMICAnnouncementDisplay>
				returnValue =
					CMICAnnouncementAndNotificationServiceUtil.
						getAnnouncementDisplays();

			return returnValue.toArray(
				new com.churchmutual.core.model.CMICAnnouncementDisplay
					[returnValue.size()]);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.churchmutual.core.model.CMICNotificationDisplay[]
			getNotificationDisplays()
		throws RemoteException {

		try {
			java.util.List<com.churchmutual.core.model.CMICNotificationDisplay>
				returnValue =
					CMICAnnouncementAndNotificationServiceUtil.
						getNotificationDisplays();

			return returnValue.toArray(
				new com.churchmutual.core.model.CMICNotificationDisplay
					[returnValue.size()]);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void markAsReadAnnouncement(long announcementEntryId)
		throws RemoteException {

		try {
			CMICAnnouncementAndNotificationServiceUtil.markAsReadAnnouncement(
				announcementEntryId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void markAsReadNotification(long userNotificationEventId)
		throws RemoteException {

		try {
			CMICAnnouncementAndNotificationServiceUtil.markAsReadNotification(
				userNotificationEventId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		CMICAnnouncementAndNotificationServiceSoap.class);

}