import React from 'react';
import ReactDOM from 'react-dom';
import Contacts from './Contacts';

/**
 * This is the main entry point of the portlet.
 *
 * See https://tinyurl.com/js-ext-portlet-entry-point for the most recent
 * information on the signature of this function.
 *
 * @param  {Object} params a hash with values of interest to the portlet
 * @return {void}
 */

export default function main({portletNamespace, contextPath, portletElementId}) {
	ReactDOM.render(
		<Contacts
			portletNamespace={portletNamespace}
			contextPath={contextPath}
			portletElementId={portletElementId}
		/>,
		document.getElementById(portletElementId)
	);
}