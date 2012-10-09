Ext.define('DS.view.Viewport',{
    extend: 'Ext.Viewport',
    layout: 'fit',
    hideBorders: true,
    requires : [
        'DS.view.Header',
        'DS.view.Menu',
        'DS.view.TabPanel',
        'DS.view.South'
    ],
    initComponent : function(){
        var me = this;
        Ext.apply(me, {
            items: [{
                id:'desk',
                layout: 'border',
                items: [
                    Ext.create('DS.view.Header'),
                    Ext.create('DS.view.Menu'),
                    Ext.create('DS.view.TabPanel'),
                    Ext.create('DS.view.South')
                ]
            }]
        });
        me.callParent(arguments);
    }
});