// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package advanced_pagination_wrapper.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	/**
	 * @deprecated
	 * The default constructor of the Microflows class should not be used.
	 * Use the static microflow invocation methods instead.
	 */
	@java.lang.Deprecated(since = "9.12", forRemoval = true)
	public Microflows() {}

	// These are the microflows for the Advanced_Pagination_Wrapper module
	public static void aCT_Pagination_Refresh(IContext context, advanced_pagination_wrapper.proxies.Pagination _pagination)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Pagination", _pagination == null ? null : _pagination.getMendixObject());
		Core.microflowCall("Advanced_Pagination_Wrapper.ACT_Pagination_Refresh").withParams(params).execute(context);
	}
	public static void aCT_Pagination_SearchOrReset(IContext context, advanced_pagination_wrapper.proxies.Pagination _pagination)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Pagination", _pagination == null ? null : _pagination.getMendixObject());
		Core.microflowCall("Advanced_Pagination_Wrapper.ACT_Pagination_SearchOrReset").withParams(params).execute(context);
	}
	public static void aCT_Search_Field(IContext context, advanced_pagination_wrapper.proxies.SearchHelper _searchHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SearchHelper", _searchHelper == null ? null : _searchHelper.getMendixObject());
		Core.microflowCall("Advanced_Pagination_Wrapper.ACT_Search_Field").withParams(params).execute(context);
	}
	public static void aCT_Search_Filter(IContext context, advanced_pagination_wrapper.proxies.SearchHelper _searchHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SearchHelper", _searchHelper == null ? null : _searchHelper.getMendixObject());
		Core.microflowCall("Advanced_Pagination_Wrapper.ACT_Search_Filter").withParams(params).execute(context);
	}
	public static void aCT_Search_Reset(IContext context, advanced_pagination_wrapper.proxies.SearchHelper _searchHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SearchHelper", _searchHelper == null ? null : _searchHelper.getMendixObject());
		Core.microflowCall("Advanced_Pagination_Wrapper.ACT_Search_Reset").withParams(params).execute(context);
	}
	public static java.util.List<advanced_pagination_wrapper.proxies.Item_Example> dS_Items_Example(IContext context, advanced_pagination_wrapper.proxies.SearchHelper _searchHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SearchHelper", _searchHelper == null ? null : _searchHelper.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("Advanced_Pagination_Wrapper.DS_Items_Example").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> advanced_pagination_wrapper.proxies.Item_Example.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static advanced_pagination_wrapper.proxies.PageHelper dS_PageHelper(IContext context, advanced_pagination_wrapper.proxies.Pagination _pagination)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Pagination", _pagination == null ? null : _pagination.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Advanced_Pagination_Wrapper.DS_PageHelper").withParams(params).execute(context);
		return result == null ? null : advanced_pagination_wrapper.proxies.PageHelper.initialize(context, result);
	}
	public static advanced_pagination_wrapper.proxies.Configuration dS_PaginationConfiguration(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Advanced_Pagination_Wrapper.DS_PaginationConfiguration").withParams(params).execute(context);
		return result == null ? null : advanced_pagination_wrapper.proxies.Configuration.initialize(context, result);
	}
	public static advanced_pagination_wrapper.proxies.SearchHelper dS_SearchHelper(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Advanced_Pagination_Wrapper.DS_SearchHelper").withParams(params).execute(context);
		return result == null ? null : advanced_pagination_wrapper.proxies.SearchHelper.initialize(context, result);
	}
	public static advanced_pagination_wrapper.proxies.SelectionHelper dS_SelectionHelper(IContext context, advanced_pagination_wrapper.proxies.Item_Example _item_Example, advanced_pagination_wrapper.proxies.Pagination _pagination)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Item_Example", _item_Example == null ? null : _item_Example.getMendixObject());
		params.put("Pagination", _pagination == null ? null : _pagination.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Advanced_Pagination_Wrapper.DS_SelectionHelper").withParams(params).execute(context);
		return result == null ? null : advanced_pagination_wrapper.proxies.SelectionHelper.initialize(context, result);
	}
	public static void oCH_SelectAll(IContext context, advanced_pagination_wrapper.proxies.PageHelper _pageHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("PageHelper", _pageHelper == null ? null : _pageHelper.getMendixObject());
		Core.microflowCall("Advanced_Pagination_Wrapper.OCH_SelectAll").withParams(params).execute(context);
	}
	public static void oCH_SelectionHelper(IContext context, advanced_pagination_wrapper.proxies.SelectionHelper _selectionHelper, advanced_pagination_wrapper.proxies.Pagination _pagination)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SelectionHelper", _selectionHelper == null ? null : _selectionHelper.getMendixObject());
		params.put("Pagination", _pagination == null ? null : _pagination.getMendixObject());
		Core.microflowCall("Advanced_Pagination_Wrapper.OCH_SelectionHelper").withParams(params).execute(context);
	}
	public static boolean sUB_CheckIfAllSelected(IContext context, advanced_pagination_wrapper.proxies.Pagination _pagination, advanced_pagination_wrapper.proxies.PageHelper _currentPageHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Pagination", _pagination == null ? null : _pagination.getMendixObject());
		params.put("CurrentPageHelper", _currentPageHelper == null ? null : _currentPageHelper.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("Advanced_Pagination_Wrapper.SUB_CheckIfAllSelected").withParams(params).execute(context);
	}
	public static void sUB_CheckSelectAll(IContext context, advanced_pagination_wrapper.proxies.Pagination _pagination)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Pagination", _pagination == null ? null : _pagination.getMendixObject());
		Core.microflowCall("Advanced_Pagination_Wrapper.SUB_CheckSelectAll").withParams(params).execute(context);
	}
	public static void sUB_ResetSearchCheck(IContext context, advanced_pagination_wrapper.proxies.SearchHelper _searchHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SearchHelper", _searchHelper == null ? null : _searchHelper.getMendixObject());
		Core.microflowCall("Advanced_Pagination_Wrapper.SUB_ResetSearchCheck").withParams(params).execute(context);
	}
	public static void sUB_SavePageNumberAndRefresh(IContext context, advanced_pagination_wrapper.proxies.SelectionHelper _selectionHelper, advanced_pagination_wrapper.proxies.Pagination _pagination)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SelectionHelper", _selectionHelper == null ? null : _selectionHelper.getMendixObject());
		params.put("Pagination", _pagination == null ? null : _pagination.getMendixObject());
		Core.microflowCall("Advanced_Pagination_Wrapper.SUB_SavePageNumberAndRefresh").withParams(params).execute(context);
	}
	public static java.util.List<advanced_pagination_wrapper.proxies.Item_Example> sUB_SearchItemsAccordingToType_Example(IContext context, advanced_pagination_wrapper.proxies.SearchHelper _searchHelper, advanced_pagination_wrapper.proxies.Search _search)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SearchHelper", _searchHelper == null ? null : _searchHelper.getMendixObject());
		params.put("Search", _search == null ? null : _search.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("Advanced_Pagination_Wrapper.SUB_SearchItemsAccordingToType_Example").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> advanced_pagination_wrapper.proxies.Item_Example.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static java.util.List<advanced_pagination_wrapper.proxies.Item_Example> sUB_SearchItemsWithFilter_Example(IContext context, advanced_pagination_wrapper.proxies.Search _search, advanced_pagination_wrapper.proxies.SearchHelper _searchHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Search", _search == null ? null : _search.getMendixObject());
		params.put("SearchHelper", _searchHelper == null ? null : _searchHelper.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("Advanced_Pagination_Wrapper.SUB_SearchItemsWithFilter_Example").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> advanced_pagination_wrapper.proxies.Item_Example.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static java.util.List<advanced_pagination_wrapper.proxies.Item_Example> sUB_SearchItemsWithSearchField_Example(IContext context, advanced_pagination_wrapper.proxies.Search _search, advanced_pagination_wrapper.proxies.SearchHelper _searchHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Search", _search == null ? null : _search.getMendixObject());
		params.put("SearchHelper", _searchHelper == null ? null : _searchHelper.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("Advanced_Pagination_Wrapper.SUB_SearchItemsWithSearchField_Example").withParams(params).execute(context);
		if (objs == null) {
			return null;
		} else {
			return objs.stream()
				.map(obj -> advanced_pagination_wrapper.proxies.Item_Example.initialize(context, obj))
				.collect(java.util.stream.Collectors.toList());
		}
	}
	public static void sUB_SearchType_Empty(IContext context, advanced_pagination_wrapper.proxies.SearchHelper _searchHelper)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SearchHelper", _searchHelper == null ? null : _searchHelper.getMendixObject());
		Core.microflowCall("Advanced_Pagination_Wrapper.SUB_SearchType_Empty").withParams(params).execute(context);
	}
	public static void sUB_SearchType_Filter(IContext context, advanced_pagination_wrapper.proxies.SearchHelper _searchHelper, advanced_pagination_wrapper.proxies.Search _search)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SearchHelper", _searchHelper == null ? null : _searchHelper.getMendixObject());
		params.put("Search", _search == null ? null : _search.getMendixObject());
		Core.microflowCall("Advanced_Pagination_Wrapper.SUB_SearchType_Filter").withParams(params).execute(context);
	}
	public static void sUB_SearchType_SearchField(IContext context, advanced_pagination_wrapper.proxies.SearchHelper _searchHelper, advanced_pagination_wrapper.proxies.Search _search)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SearchHelper", _searchHelper == null ? null : _searchHelper.getMendixObject());
		params.put("Search", _search == null ? null : _search.getMendixObject());
		Core.microflowCall("Advanced_Pagination_Wrapper.SUB_SearchType_SearchField").withParams(params).execute(context);
	}
	public static void sUB_UpdateAllPageHelpers(IContext context, advanced_pagination_wrapper.proxies.Pagination _pagination)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Pagination", _pagination == null ? null : _pagination.getMendixObject());
		Core.microflowCall("Advanced_Pagination_Wrapper.SUB_UpdateAllPageHelpers").withParams(params).execute(context);
	}
}