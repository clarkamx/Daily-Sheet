Ext.define('DS.view.Header', {
	extend : 'Ext.Component',
	initComponent : function() {
		Ext.applyIf(this, {
			xtype : 'box',
			cls : 'header',
			region : 'north',
			html : '<h1>HSK日报数据库</h1>',
			height : 50
		});
		this.callParent(arguments);
	}
});