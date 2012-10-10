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
						"当前用户：Guest", 
						'->',
						"技术支持:<a href='mailto:clarkamx@gmail.com' target='_blank' style='text-decoration:none;'><font color='#0000FF'>clarkamx@gmail.com</font></a>&nbsp;&nbsp;"
					]
				}
			);
			this.callParent(arguments);
		}
	}
);