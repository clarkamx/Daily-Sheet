//开启动态加载
Ext.Loader.setConfig({
			enabled : true
		});
Ext.application({
			name : 'DS',//
			autoCreateViewport: true,
			appFolder : 'app',
			controllers : ['Main']
		});