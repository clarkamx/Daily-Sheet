Ext.define(
	'DS.view.South',
	{
		extend : 'Ext.Toolbar',
		initComponent : function() {
			Ext.apply(
				this,
				{
					id : "bottom",
					// frame:true,
					region : "south",
					height : 23,
					items : [
						"当前用户：Guest"
					]
				}
			);
			this.callParent(arguments);
		}
	}
);