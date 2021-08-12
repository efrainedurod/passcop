package com.passcop.source.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.event.ActionEvent;

public abstract class AbstractController<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Class<T> itemClass;
	private List<T> items;
	private T selected;

	private long itemID = 0;

	private String filter = "";
	private boolean paginationEnabled = true;

	private int pageIndex = 0; // Numero de pagina actual
	private int pageSize = 20; // Numero de registros por pagina
	private int totalPages; // Maximo numero de paginas
	
	public AbstractController() {
		
	}

	public AbstractController(Class<T> itemClass, boolean paginationEnabled) {
		this.itemClass = itemClass;
		this.paginationEnabled = paginationEnabled;
	}

	// *********************** Loading Operations **********************

	public abstract String onload(boolean mustList);

	// ************************* CRUD Operations ***********************

	public abstract void find();

	public abstract void retrieveResultsPage();

	public abstract long getItemsCount();

	public abstract void filterAction(ActionEvent event);

	public abstract void saveAction(ActionEvent event);

	public abstract void deleteAction(ActionEvent event);

	// ************************** Redirections **************************

	public abstract void goEdit(long id);

	public abstract void goList();

	// *************************** Pagination ***************************

	/**
	 * Verificar si tiene paginas siguientes
	 * 
	 * @return true si tiene, caso contrario false
	 */
	public boolean isHasNextPage() {
		if (pageIndex + 1 < totalPages) {
			return true;
		}
		return false;
	}

	/**
	 * Verificar si tiene paginas anteriores
	 * 
	 * @return true si tiene, caso contrario false
	 */
	public boolean isHasPreviousPage() {
		if (pageIndex > 0) {
			return true;
		}
		return false;
	}

	/**
	 * Actualizar la lista con datos de la siguiente pagina
	 */
	public void next() {
		pageIndex = pageIndex + 1;
		retrieveResultsPage();
	}

	/**
	 * Actualizar la lista con datos de la utlima pagina
	 */
	public void nextLast() {
		pageIndex = totalPages - 1;
		retrieveResultsPage();
	}

	/**
	 * Actualizar la lista con datos de la pagina anterior
	 */
	public void previous() {
		pageIndex = pageIndex - 1;
		retrieveResultsPage();
	}

	/**
	 * Actualizar la lista con datos de la primera pagina
	 */
	public void previousBegin() {
		pageIndex = 0;
		retrieveResultsPage();
	}

	// *********************** Getters and Setters **********************

	public Class<T> getItemClass() {
		return itemClass;
	}

	public void setItemClass(Class<T> itemClass) {
		this.itemClass = itemClass;
	}

	public T getSelected() {
		return selected;
	}

	public void setSelected(T selected) {
		this.selected = selected;
	}

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public boolean isPaginationEnabled() {
		return paginationEnabled;
	}

	public void setPaginationEnabled(boolean paginationEnabled) {
		this.paginationEnabled = paginationEnabled;
	}

	public long getItemID() {
		return itemID;
	}

	public void setItemID(long itemID) {
		this.itemID = itemID;
	}

}
