// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package advanced_pagination_wrapper.proxies;

public class SelectionHelper
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject selectionHelperMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Advanced_Pagination_Wrapper.SelectionHelper";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Selected("Selected"),
		PageNumber("PageNumber"),
		SelectionHelper_PageHelper("Advanced_Pagination_Wrapper.SelectionHelper_PageHelper"),
		SelectionHelper_Item_Example("Advanced_Pagination_Wrapper.SelectionHelper_Item_Example"),
		SelectionHelper_Session("Advanced_Pagination_Wrapper.SelectionHelper_Session");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public SelectionHelper(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected SelectionHelper(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject selectionHelperMendixObject)
	{
		if (selectionHelperMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, selectionHelperMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.selectionHelperMendixObject = selectionHelperMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SelectionHelper.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static advanced_pagination_wrapper.proxies.SelectionHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return advanced_pagination_wrapper.proxies.SelectionHelper.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static advanced_pagination_wrapper.proxies.SelectionHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new advanced_pagination_wrapper.proxies.SelectionHelper(context, mendixObject);
	}

	public static advanced_pagination_wrapper.proxies.SelectionHelper load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return advanced_pagination_wrapper.proxies.SelectionHelper.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Selected
	 */
	public final java.lang.Boolean getSelected()
	{
		return getSelected(getContext());
	}

	/**
	 * @param context
	 * @return value of Selected
	 */
	public final java.lang.Boolean getSelected(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Selected.toString());
	}

	/**
	 * Set value of Selected
	 * @param selected
	 */
	public final void setSelected(java.lang.Boolean selected)
	{
		setSelected(getContext(), selected);
	}

	/**
	 * Set value of Selected
	 * @param context
	 * @param selected
	 */
	public final void setSelected(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean selected)
	{
		getMendixObject().setValue(context, MemberNames.Selected.toString(), selected);
	}

	/**
	 * @return value of PageNumber
	 */
	public final java.lang.Integer getPageNumber()
	{
		return getPageNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of PageNumber
	 */
	public final java.lang.Integer getPageNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.PageNumber.toString());
	}

	/**
	 * Set value of PageNumber
	 * @param pagenumber
	 */
	public final void setPageNumber(java.lang.Integer pagenumber)
	{
		setPageNumber(getContext(), pagenumber);
	}

	/**
	 * Set value of PageNumber
	 * @param context
	 * @param pagenumber
	 */
	public final void setPageNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer pagenumber)
	{
		getMendixObject().setValue(context, MemberNames.PageNumber.toString(), pagenumber);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of SelectionHelper_PageHelper
	 */
	public final advanced_pagination_wrapper.proxies.PageHelper getSelectionHelper_PageHelper() throws com.mendix.core.CoreException
	{
		return getSelectionHelper_PageHelper(getContext());
	}

	/**
	 * @param context
	 * @return value of SelectionHelper_PageHelper
	 * @throws com.mendix.core.CoreException
	 */
	public final advanced_pagination_wrapper.proxies.PageHelper getSelectionHelper_PageHelper(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		advanced_pagination_wrapper.proxies.PageHelper result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SelectionHelper_PageHelper.toString());
		if (identifier != null) {
			result = advanced_pagination_wrapper.proxies.PageHelper.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of SelectionHelper_PageHelper
	 * @param selectionhelper_pagehelper
	 */
	public final void setSelectionHelper_PageHelper(advanced_pagination_wrapper.proxies.PageHelper selectionhelper_pagehelper)
	{
		setSelectionHelper_PageHelper(getContext(), selectionhelper_pagehelper);
	}

	/**
	 * Set value of SelectionHelper_PageHelper
	 * @param context
	 * @param selectionhelper_pagehelper
	 */
	public final void setSelectionHelper_PageHelper(com.mendix.systemwideinterfaces.core.IContext context, advanced_pagination_wrapper.proxies.PageHelper selectionhelper_pagehelper)
	{
		if (selectionhelper_pagehelper == null) {
			getMendixObject().setValue(context, MemberNames.SelectionHelper_PageHelper.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.SelectionHelper_PageHelper.toString(), selectionhelper_pagehelper.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of SelectionHelper_Item_Example
	 */
	public final advanced_pagination_wrapper.proxies.Item_Example getSelectionHelper_Item_Example() throws com.mendix.core.CoreException
	{
		return getSelectionHelper_Item_Example(getContext());
	}

	/**
	 * @param context
	 * @return value of SelectionHelper_Item_Example
	 * @throws com.mendix.core.CoreException
	 */
	public final advanced_pagination_wrapper.proxies.Item_Example getSelectionHelper_Item_Example(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		advanced_pagination_wrapper.proxies.Item_Example result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SelectionHelper_Item_Example.toString());
		if (identifier != null) {
			result = advanced_pagination_wrapper.proxies.Item_Example.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of SelectionHelper_Item_Example
	 * @param selectionhelper_item_example
	 */
	public final void setSelectionHelper_Item_Example(advanced_pagination_wrapper.proxies.Item_Example selectionhelper_item_example)
	{
		setSelectionHelper_Item_Example(getContext(), selectionhelper_item_example);
	}

	/**
	 * Set value of SelectionHelper_Item_Example
	 * @param context
	 * @param selectionhelper_item_example
	 */
	public final void setSelectionHelper_Item_Example(com.mendix.systemwideinterfaces.core.IContext context, advanced_pagination_wrapper.proxies.Item_Example selectionhelper_item_example)
	{
		if (selectionhelper_item_example == null) {
			getMendixObject().setValue(context, MemberNames.SelectionHelper_Item_Example.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.SelectionHelper_Item_Example.toString(), selectionhelper_item_example.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of SelectionHelper_Session
	 */
	public final system.proxies.Session getSelectionHelper_Session() throws com.mendix.core.CoreException
	{
		return getSelectionHelper_Session(getContext());
	}

	/**
	 * @param context
	 * @return value of SelectionHelper_Session
	 * @throws com.mendix.core.CoreException
	 */
	public final system.proxies.Session getSelectionHelper_Session(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.Session result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SelectionHelper_Session.toString());
		if (identifier != null) {
			result = system.proxies.Session.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of SelectionHelper_Session
	 * @param selectionhelper_session
	 */
	public final void setSelectionHelper_Session(system.proxies.Session selectionhelper_session)
	{
		setSelectionHelper_Session(getContext(), selectionhelper_session);
	}

	/**
	 * Set value of SelectionHelper_Session
	 * @param context
	 * @param selectionhelper_session
	 */
	public final void setSelectionHelper_Session(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.Session selectionhelper_session)
	{
		if (selectionhelper_session == null) {
			getMendixObject().setValue(context, MemberNames.SelectionHelper_Session.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.SelectionHelper_Session.toString(), selectionhelper_session.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return selectionHelperMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final advanced_pagination_wrapper.proxies.SelectionHelper that = (advanced_pagination_wrapper.proxies.SelectionHelper) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
