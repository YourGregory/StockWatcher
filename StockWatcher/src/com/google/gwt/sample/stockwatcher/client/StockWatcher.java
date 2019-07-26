package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class StockWatcher implements EntryPoint {

private VerticalPanel mainPanel = new VerticalPanel();
private FlexTable stocksFlexTable = new FlexTable();
private HorizontalPanel addPanel = new HorizontalPanel();
private TextBox newSymbolTextBox = new TextBox();
private Button addStockButton = new Button("Add");
private Label lastUpdatedLabel = new Label();

/**
 * Entry point method.
 */
public void onModuleLoad() {
	
    stocksFlexTable.setText(0, 0, "Symbol");
    stocksFlexTable.setText(0, 1, "Price");
    stocksFlexTable.setText(0, 2, "Change");
    stocksFlexTable.setText(0, 3, "Remove");

    // Stock panel.
    addPanel.add(newSymbolTextBox);
    addPanel.add(addStockButton);

    // Main panel.
    mainPanel.add(stocksFlexTable);
    mainPanel.add(addPanel);
    mainPanel.add(lastUpdatedLabel);
    
    RootPanel.get("stockList").add(mainPanel);
    
    newSymbolTextBox.setFocus(true);
  }
}