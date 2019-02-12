package net.emecas.udeploy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.urbancode.commons.httpcomponentsutil.HttpClientBuilder;

public class ExperimentalClient extends HttpClientBuilder {
	//168c9eb7-ce19-9514-0f38-e511989afddb
	
	static String API_BASE_URL = "https://<udeployurl>>";
	static String APP_INFO = API_BASE_URL+"/cli/application/info?application=%s";
	static String APP_COMPONENTS_INFO = API_BASE_URL+"/cli/application/componentsInApplication?application=%s"; 
	static String APP_BLUEPRINTS_IN = API_BASE_URL+"/cli/application/blueprintsInApplication?application=%s";
	static String APP_PROPERTIES = API_BASE_URL+"/cli/application/getProperties?application=%s";
	static String APP_ENVIRONMENTS_IN = API_BASE_URL+"/cli/application/environmentsInApplication?application=%s";
	static String APP_PROCESS = API_BASE_URL+"/cli/applicationProcess?application=%s";
	static String APP_PROCESS_REQUIRED_PROPERTIES = API_BASE_URL+"/cli/applicationProcess/unfilledProperties?application=%s&processName=%s";
	static String APP_PROCESS_INFO = API_BASE_URL+"/cli/applicationProcess/info?application=%s&processName=%s";
	
	
	static String APP_COMPONENTS_PROCESS = API_BASE_URL+"/cli/componentProcess/info?component=%s&componentProcess=%s";

	
	static String ENVIRONMENT_INFO = API_BASE_URL+"/landscaper/rest/environment/%s";
	static String ENVIRONMENT_COMPONENTS_INFO = API_BASE_URL+"/landscaper/rest/%s/components";
	static String ENVIRONMENTS = API_BASE_URL+"/landscaper/rest/environment/";
	
	
	
	static String userName = "api_ui";
	static String password = "<<>>-N-g-J-ZC8GdX<<>>";
	
	//@Override
	public static String retrieve(String url, String userName, String password, boolean trustAllCerts) {
		HttpClientBuilder httpClientBuilder = new HttpClientBuilder();
		httpClientBuilder.setUsername(userName);
		httpClientBuilder.setPassword(password);
		httpClientBuilder.setTrustAllCerts(trustAllCerts);

	    DefaultHttpClient client = httpClientBuilder.buildClient();

	    int statusCode = 0;
	    String statusMsg;
	    StringBuilder stringBuilder = new StringBuilder();

	    try {
	        HttpGet request = new HttpGet(new URI(url));
	        org.apache.http.HttpResponse resp = client.execute(request);
	        BufferedReader br = new BufferedReader ( 
	                new InputStreamReader(resp.getEntity().getContent()));

	        statusCode = resp.getStatusLine().getStatusCode();
	        
	        statusMsg = resp.getStatusLine().getReasonPhrase();
	        
			System.out.println(statusCode);
			System.out.println(statusMsg);
			System.out.println(resp.getStatusLine());
			System.out.println(resp);


	        String currentLine = null;
	        while ((currentLine = br.readLine()) != null){
	            stringBuilder = stringBuilder.append(currentLine);
	        }

	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (URISyntaxException e) {
	        e.printStackTrace();
	    }
	return stringBuilder.toString();
	}


	public static String rest(String url) {
		boolean trustAllCerts = true;
		String response = retrieve(url ,userName ,password ,trustAllCerts );
		return response;
	}
	
	
//	RESPONSE
//	
//	
//	401
//
//	HTTP/1.1 401 
//	HTTP/1.1 401  [Date: Thu, 17 Jan 2019 16:49:10 GMT, Server: SERVER, Cache-Control: private, Expires: Wed, 31 Dec 1969 19:00:00 EST, X-Frame-Options: SAMEORIGIN, WWW-Authenticate: Basic realm="IBM UrbanCode Deploy", Content-Type: text/html;charset=UTF-8, Vary: Accept-Encoding, Set-Cookie: UCD_CSRF_TOKEN=b35aa0af-6897-4339-b77c-3c3c70e17923; Max-Age=2147483647; Expires=Tue, 04-Feb-2087 20:03:17 GMT; Path=/; Secure, Set-Cookie: UCD_SESSION_KEY=b35aa0af-6897-4339-b77c-3c3c70e17923; Max-Age=2147483647; Expires=Tue, 04-Feb-2087 20:03:17 GMT; Path=/; Secure, Set-Cookie: JSESSIONID_8081=F755741B898245DCAC329366D607C7AF; Path=/; Secure; HttpOnly, X-Server-Name: apachenode01.liberty.edu, Keep-Alive: timeout=31, Connection: Keep-Alive, Transfer-Encoding: chunked]
//	<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml">  <head>    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>    <title>IBM UrbanCode Deploy</title>    <link rel="shortcut icon" href="/static/6.2.6.1.940532/images/uDeploy.ico"/>    <link rel="stylesheet" type="text/css" href="/static/6.2.6.1.940532/lib/dojo/dojo/resources/dojo.css"/><link rel="stylesheet" type="text/css" href="/static/6.2.6.1.940532/lib/dojo/dijit/themes/dijit.css"/><link rel="stylesheet" type="text/css" href="/static/6.2.6.1.940532/lib/dojo/dijit/themes/dijit_rtl.css"/><link rel="stylesheet" type="text/css" href="/static/6.2.6.1.940532/lib/idx/themes/oneui/oneui.css"/><link rel="stylesheet" type="text/css" href="/static/6.2.6.1.940532/lib/dojo/dojox/form/resources/CheckedMultiSelect.css" /><link rel="stylesheet" type="text/css" href="/static/6.2.6.1.940532/lib/dojo/dojox/layout/resources/ResizeHandle.css" /><link rel="stylesheet" type="text/css" href="/static/6.2.6.1.940532/lib/dojo/dojox/widget/Wizard/Wizard.css" /><link rel="stylesheet" type="text/css" href="/static/6.2.6.1.940532/lib/webext/css/webext/webext-common.css"/><link rel="stylesheet" type="text/css" href="/static/6.2.6.1.940532/lib/webext/css/webext/webext-widgets.css"/><link rel="stylesheet" type="text/css" href="/static/6.2.6.1.940532/css/deploy/icons.css" /><link rel="stylesheet" type="text/css" href="/static/6.2.6.1.940532/css/deploy/udeploy.css" /><!--[if IE]><script type="text/javascript">  if (("undefined" !== typeof JSON)          && (JSON.stringify(document.createElement("input").value)!== '""' ) ) {      var _stringify = JSON.stringify;      JSON.stringify = function(o, f, s) {          var replacer = function(key, value) {              if (value === "" ) {                  // Fix IE8 stringify bug for input values                  return "";              }              // normal behavior              return f ? f(key,value) : value;          }          return _stringify(o, replacer, s);      }  }</script><![endif]--><script type="text/javascript">    mxBasePath = "/static/6.2.6.1.940532/lib/mxgraph";    var defaultLocale = "en_US";    if (defaultLocale === "en_US") {        defaultLocale = "en";    }    defaultLocale = defaultLocale.toLowerCase();    defaultLocale = defaultLocale.replace(/_/g, '-');    var dojoConfig = {        async: true,        baseUrl: "/static/6.2.6.1.940532/lib/dojo/dojo",        bindEncoding: "UTF-8",        isDebug: false,        locale: defaultLocale,        parseOnLoad: true,        // if inner iframe, ignore sniff test, because inner dojo will not be same dom as this dojo        has: {"dojo-test-sniff": !window.parent.document.getElementById("explore_iframe_id")?1:0},        paths: {            "js": "/static/6.2.6.1.940532/lib/webext/"+"js",            "idx": "/static/6.2.6.1.940532/"+"lib/idx",            "deploy": "/static/6.2.6.1.940532/"+"js/deploy",            "d3": "/static/6.2.6.1.940532/"+"lib/d3"        }    };</script><script type="text/javascript" src="/static/6.2.6.1.940532/ucdjs-pack.js"></script><script type="text/javascript" src="/static/6.2.6.1.940532/lib/mxgraph/js/mxClient.js"></script><script type="text/javascript" src="/static/6.2.6.1.940532/lib/ace/ace.js"></script><script type="text/javascript" src="/static/6.2.6.1.940532/js/deploy/mxClientPatch.js"></script><script type="text/javascript" src="/static/6.2.6.1.940532/lib/highcharts/js/highcharts.js"></script><script type="text/javascript" src="/static/6.2.6.1.940532/lib/lscache/lscache.js"></script><script type="text/javascript" src="/static/6.2.6.1.940532/lib/underscore/underscore-min.js"></script><script type="text/javascript">    /* <![CDATA[ */      // Global and utility variables.      var appState = {};      var bootstrap = null;      var util = null;      var navBar = null;      var config = null;      var formatters = null;      var i18nData = {};      var sessionSharedData = null;      require(["dojo/ready",               "dojo/dom",               "dojo/dom-style",               "dojo/dom-class",               "dojo/dom-construct",               "dojo/json",               "dojo/on",               "dojo/mouse",               "dojo/_base/array",               "dojox/layout/ContentPane",               "js/webext/widgets/Bootstrap",               "js/webext/widgets/NavigationBar",               "js/webext/widgets/TabManager",               "js/webext/widgets/Util",               "deploy/widgets/firstDayWizard/FirstDayWizardUtil",               "deploy/widgets/firstDayWizard/WhatsNextPopup",               "deploy/widgets/Formatters",               "deploy/widgets/GetStartedPopup",               "deploy/widgets/vc/VCUtil",               "deploy/widgets/FormDelegateRegistry",               "deploy/widgets/navigation/LoadingIndicator",               "dojox/html/entities",               "idx/app/Header",               "idx/widget/Menu",               "dijit/focus",               "dijit/Menu",               "dijit/MenuItem",               "dijit/PopupMenuItem",               "dijit/DropDownMenu",               "dijit/Dialog"],              function (                      ready,                      dom,                      domStyle,                      domClass,                      domConstruct,                      JSON,                      on,                      mouse,                      array,                      ContentPane,                      Bootstrap,                      NavigationBar,                      TabManager,                      Util,                      FirstDayWizardUtil,                      WhatsNextPopup,                      Formatters,                      GetStartedPopup,                      VCUtil,                      FormDelegateRegistry,                      LoadingIndicator,                      entities,                      Header,                      idxMenu,                      focusUtil,                      Menu,                      MenuItem,                      PopupMenuItem,                      DropDownMenu,                      Dialog) {        ready(function () {            var __id__ = "topPageHeader";            var userMenu = new Menu();            var helpMenu = new idxMenu();            util = new Util();            util.vc = new VCUtil();            var userIcon = '<div class="userIcon inlineBlock"></div>';            // in explore mode minimize ui            var header = {};            var exploreMode = !!window.parent.document.getElementById("explore_iframe_id");            if (!exploreMode) {                header = new Header({                    primaryTitle: "IBM UrbanCode Deploy",                    user: {                        messageName: userIcon + util.escape("Castaneda, Emerson (Application Development)"),                        displayName: util.escape("Castaneda, Emerson (Application Development)"),                        actions: userMenu                        },                        help: helpMenu,                        secondaryBannerType: "lightGray",                        contentTabsInline: true                }, __id__);            }            formatters = Formatters;            bootstrap = new Bootstrap({                initialState: {},                username: "ecastaneda1",                userId: "36700efc-df35-4044-aad7-03b2e572c36e",                userFullName: "Castaneda, Emerson (Application Development)",                baseUrl: "/",                contentUrl: "/static/6.2.6.1.940532/",                webextUrl: "/static/6.2.6.1.940532/" + "lib/webext/",                contentIdentifier: "6.2.6.1.940532",                configUrl: "/rest/navigation",                restApiUrl: "/static/6.2.6.1.940532/" + "docs/rest/index.html",                toolsUrl: "/" + "#tools",                productName: "IBM UrbanCode Deploy",                expectedSessionCookieName: "UCD_CSRF_TOKEN",                serverLicenseType: "SERVER_AUTHORIZED",                serverLicenseBackupType: "SERVER_AUTHORIZED",                isFIPSModeEnabled: false,                isEnableWelcomeTab: false            });            var timePattern = null;            var datePattern = null;            util.setupTimeDateFormat(timePattern,datePattern);            var baseTextDir = "";            util.setBaseTextDir(baseTextDir);            var calendar = null;            util.setCalendar(calendar);            util.loadI18n("en_US", function() {                util.loadConfig(null, function() {                    require(["dojo/ready",                             "dojo/request/xhr",                             "deploy/widgets/navigation/Applications",                             "deploy/widgets/navigation/Calendar",                             "deploy/widgets/navigation/Components",                             "deploy/widgets/navigation/Configuration",                             "deploy/widgets/navigation/Dashboard",                             "deploy/widgets/navigation/Processes",                             "deploy/widgets/navigation/ProcessRequests",                             "deploy/widgets/navigation/Resources",                             "deploy/widgets/navigation/Security",                             "deploy/widgets/navigation/Settings",                             "deploy/widgets/navigation/Reports"], function(ready, xhr) {                        ready(function() {                            var click = function(href, notBaseUrl){                                if (notBaseUrl){                                    window.location = href;                                }                                else {                                    window.location = bootstrap.baseUrl + href;                                }                            };                            var answersContainer = domConstruct.create("li", {                                "class": "idxHeaderPrimaryAction"                            }, header._globalActionsNode);                            var dwLink = domConstruct.create("a", {                                href: "http://developer.ibm.com/answers/?community=urbancode",                                target: "_blank",                                title: i18n("Questions? We have answers! Ask us on developerWorks."),                                className: "idxHeaderUserIcon general-icon dw-icon"                            }, answersContainer);                            var myProfileMenu = new Menu();                            domClass.add(myProfileMenu.domNode, "my-profile-menu  oneuiHeaderGlobalActionsMenu");                            var myTeamsMenuItem = new MenuItem({                                label: i18n("Team Manager"),                                onClick: function(){                                    click("#user/teamManager");                                }                            });                            myProfileMenu.addChild(myTeamsMenuItem);                            var myUsersMenuItem = new MenuItem({                                label: i18n("User Manager"),                                onClick: function(){                                    click("#user/userManager");                                }                            });                            myProfileMenu.addChild(myUsersMenuItem);                            var preferencesMenuItem = new MenuItem({                                label: i18n("Preferences"),                                onClick: function(){                                    click("#user/preferences");                                }                            });                            myProfileMenu.addChild(preferencesMenuItem);                            var myProfileMenuItem = new PopupMenuItem({                                label: i18n("My Profile"),                                popup: myProfileMenu                            });                            userMenu.addChild(myProfileMenuItem);                            on(myProfileMenu.domNode, mouse.enter, function(){                                domClass.add(myProfileMenuItem.domNode, "dijitMenuItemHover");                                on(myProfileMenu.domNode, mouse.leave, function(){                                    domClass.remove(myProfileMenuItem.domNode, "dijitMenuItemHover");                                });                            });                            userMenu.startup();                            var signOutMenuItem = new MenuItem({                                label: i18n("Sign Out"),                                onClick: function(){                                    click("/tasks/LoginTasks/logout", true);                                }                            });                            userMenu.addChild(signOutMenuItem);                            var buildHelpMenuItems = function(includeWelcomeMenuItem) {                                var helpMenuItem = new MenuItem();                                domConstruct.create("a", {                                    "innerHTML": i18n("Help"),                                    "href":                                    "http://www.ibm.com/support/knowledgecenter/SS4GSP_6.2.4",                                    "target": "_blank"                                }, helpMenuItem.containerNode);                                on(helpMenuItem.domNode, "click", function() {                                    var a = document.createElement("a");                                    a.target = "_blank";                                    a.href = "http://www.ibm.com/support/knowledgecenter/SS4GSP_6.2.4";                                    a.click();                                });                                helpMenu.addChild(helpMenuItem);                                if (includeWelcomeMenuItem) {                                    var welcomeMenuItem = new MenuItem();                                    domConstruct.create("a", {                                        "innerHTML": i18n("Welcome")                                    }, welcomeMenuItem.containerNode);                                    on(welcomeMenuItem.domNode, "click", function() {                                        FirstDayWizardUtil.navigateAndShowTab("welcome");                                        welcomeMenuItem.destroy();                                        dijit.popup.close(helpMenu);                                        focusUtil.curNode && focusUtil.curNode.blur();                                    });                                    helpMenu.addChild(welcomeMenuItem);                                }                                var getStartedMenuItem = new MenuItem();                                domConstruct.create("a", {                                    "innerHTML": i18n("Getting Started")                                }, getStartedMenuItem.containerNode);                                on(getStartedMenuItem.domNode, "click", function() {                                    var gsPopup = new GetStartedPopup({                                                       name: "gs"                                                  });                                    gsPopup.open(true);                                    dijit.popup.close(helpMenu);                                    focusUtil.curNode && focusUtil.curNode.blur();                                    focusUtil.focus(gsPopup.domNode);                                });                                helpMenu.addChild(getStartedMenuItem);                                var whatsNextMenuItem = new MenuItem();                                domConstruct.create("a", {                                    "innerHTML": i18n("What's Next")                                }, whatsNextMenuItem.containerNode);                                on(whatsNextMenuItem.domNode, "click", function(){                                    var wnPopup = new WhatsNextPopup({                                        name:"wn"                                    });                                    wnPopup.open(true);                                    dijit.popup.close(helpMenu);                                    focusUtil.curNode && focusUtil.curNode.blue();                                    focusUtil.focus(wnPopup.domNode);                                });                                helpMenu.addChild(whatsNextMenuItem);                                var toolsMenuItem = new MenuItem();                                domConstruct.create("a", {                                    "innerHTML": i18n("Tools"),                                    "href": "#tools"                                }, toolsMenuItem.containerNode);                                on(toolsMenuItem.domNode, "click", function() {                                    var a = document.createElement("a");                                    a.href = "#tools";                                    a.click();                                });                                helpMenu.addChild(toolsMenuItem);                                var aboutMenuItem = new MenuItem();                                var aboutLink = domConstruct.create("a", {                                    "innerHTML": i18n("About")                                }, aboutMenuItem.containerNode);                                on(aboutMenuItem.domNode, "click", function() {                                    var aboutFrame = new Dialog({                                        className: "about-popup",                                        closeable: true                                    });                                    var aboutcloseButton = domConstruct.create("div", {                                        className: "close-popup-button",                                        title: i18n("Close")                                    }, aboutFrame.titleNode);                                    on(aboutcloseButton, "click", function(){                                        aboutFrame.hide();                                    });                                    var aboutProductName = domConstruct.create("div", {                                        className: "product-name",                                        innerHTML: "IBM UrbanCode Deploy"                                    }, aboutFrame.containerNode);                                    var aboutProductVersion = domConstruct.create("div", {                                        className: "product-version",                                        innerHTML: i18n("version %s", "6.2.6.1.940532")                                    }, aboutFrame.containerNode);                                    var aboutProductDescription = domConstruct.create("div", {                                        className: "product-description",                                        innerHTML: i18n("© Copyright "+                                                "IBM Corp. 2011, 2017. All Rights Reserved.")+"<br/><br/>"+                                                i18n("U.S. Government Users Restricted Rights: Use, "+                                                "duplication or disclosure restricted by GSA ADP "+                                                "Schedule Contract with IBM Corp.")                                    }, aboutFrame.containerNode);                                    aboutFrame.show();                                    on(dom.byId("dijit_DialogUnderlay_0"), "click", function(){                                        aboutFrame.hide();                                    });                                });                                helpMenu.addChild(aboutMenuItem);                            };                            var buildTabNavigation = function(showWelcomeTab) {                                //insert welcome tab if not in exloreMode                                if (!exploreMode) {                                    var welcomeTab = {                                         id: "welcome",                                         label: i18n("Welcome"),                                         hash: "welcome",                                         hashPattern: "main/root",                                         tabSet: config.getTabSet("main"),                                    };                                    config.getTabSet("main").tabs.splice(1, 0, welcomeTab);                                    if (showWelcomeTab) {                                        config.getTabSet("main").defaultTab = "welcome";                                    }                                }                                // if explore mode, show only select tabs                                var tabSet = config.getTabSet("main");                                if (exploreMode) {                                    tabSet.defaultTab = "components";                                    var i=0;                                    var exploreTabs = ["root", "components", "applications", "processes", "resources"];                                    while (i<tabSet.tabs.length) {                                        var tab = tabSet.tabs[i];                                        if (exploreTabs.indexOf(tab.id)!==-1) {                                            i++;                                        } else {                                            tabSet.tabs.splice(i,1);                                        }                                    }                                }                                var topLevelManager = new TabManager({                                    tabSet: tabSet,                                    tab: tabSet.tabs[0],                                    isTopLevelTabs: true                                });                                topLevelManager.placeAt("topLevelTabs");                                topLevelManager.startup();                                navBar = new NavigationBar({                                    topLevelTabManager: topLevelManager,                                    toggleDetails: true                                });                                navBar.startup();                                if (window.location.hash.length === 0) {                                    navBar.setHash("", false, true);                                }                                var loadingIndicator = new LoadingIndicator();                                navBar.startManager();                                if (!exploreMode && !showWelcomeTab) {                                    FirstDayWizardUtil.hideMainTab("welcome");                                }                            };                            var getUserPreferences = function() {                                var userPreferencesUrl = bootstrap.restUrl + 'security/userPreferences';                                return xhr(userPreferencesUrl, {                                    handleAs: "json"                                });                            };                            if (exploreMode) {                                buildTabNavigation(false);                            } else {                                if (bootstrap.isEnableWelcomeTab) {                                    getUserPreferences().then(function(pref) {                                        if (pref && pref.dismissedUserAlerts &&                                            pref.dismissedUserAlerts.dismissed_welcome) {                                            buildTabNavigation(false);                                            buildHelpMenuItems(true);                                        } else {                                            buildTabNavigation(true);                                            buildHelpMenuItems(false);                                        }                                    }, function(err) {                                        buildTabNavigation(true);                                        buildHelpMenuItems(false);                                    });                                } else {                                    buildTabNavigation(false);                                    buildHelpMenuItems(false);                                }                            }                        });                    });                });            });            // This is used by automated testing to scrape code coverage data from the UI.            on(dom.byId("coverageData"), "click", function() {                if (__coverage__) {                    dom.byId("coverageData").innerHTML = JSON.stringify(__coverage__);                    __coverage__ = {};                }            });        });      });    /* ]]> */    </script>  </head>  <body class="oneui " id="body" dir="ltr" lang="en">    <div id="topPageHeader"></div>    <div class="topLevelTabs" id="topLevelTabs"></div>    <div class="window-wrapper">      <div class="secondary-nav">        <div class="breadcrumb" id="_webext_breadcrumbs"></div>      </div>      <div class="page-content">        <div class="inner-page-content">          <div class="_webext_detail_header" id="_webext_detail_header"></div>          <div id="secondLevelTabs"></div>          <div data-dojo-type="dojox.layout.ContentPane" id="_webext_content" class="_webext_content" style="padding: 0px;"></div>        </div>      </div>      <div class="footer-spacer"></div>    </div>    <div class="page-footer">      <div class="footer-content"></div>    </div>    <iframe id="formTarget" name="formTarget" style="display: none;" onLoad="require(['dojo/_base/connect'], function(connect){connect.publish('formTarget',['formTargetLoaded'])})"></iframe>    <!-- DOM Node for testing coverage data -->    <div id="coverageData" style="display: inline-block;          width: 1px; height: 1px; overflow: hidden;          position: fixed; top: 0px; left: 0px; z-index: 100000;"></div>  </body></html>
//	
//	
	
//	404
//
//	HTTP/1.1 404 
//	HTTP/1.1 404  [Date: Wed, 23 Jan 2019 21:41:13 GMT, Server: SERVER, Cache-Control: no-cache, Expires: Thu, 01 Jan 1970 00:00:00 GMT, X-Frame-Options: SAMEORIGIN, Pragma: No-cache, WWW-Authenticate: Basic realm="IBM UrbanCode Deploy", Content-Type: text/plain;charset=UTF-8, Vary: Accept-Encoding, Set-Cookie: UCD_CSRF_TOKEN=4afcf183-dda3-43ab-86a7-e2860b3de061; Max-Age=2147483647; Expires=Tue, 11-Feb-2087 00:55:20 GMT; Path=/; Secure, Set-Cookie: UCD_SESSION_KEY=4afcf183-dda3-43ab-86a7-e2860b3de061; Max-Age=2147483647; Expires=Tue, 11-Feb-2087 00:55:20 GMT; Path=/; Secure, Set-Cookie: JSESSIONID_8081=24138F12A7244A5D3DF25790C0DEBA91; Path=/; Secure; HttpOnly, X-Server-Name: apachenode02.liberty.edu, Keep-Alive: timeout=31, Connection: Keep-Alive, Transfer-Encoding: chunked]
//	No application for aIS-AMQP-API	
	
	
	
//	HTTP/1.1 200 
//	HTTP/1.1 200  [Date: Wed, 23 Jan 2019 21:14:47 GMT, Server: SERVER, Cache-Control: no-cache, Expires: Thu, 01 Jan 1970 00:00:00 GMT, X-Frame-Options: SAMEORIGIN, Pragma: No-cache, WWW-Authenticate: Basic realm="IBM UrbanCode Deploy", Content-Type: application/json;charset=UTF-8, Set-Cookie: UCD_CSRF_TOKEN=66e51aa0-180a-473d-b18c-2d0e9da1a0c9; Max-Age=2147483647; Expires=Tue, 11-Feb-2087 00:28:54 GMT; Path=/; Secure, Set-Cookie: UCD_SESSION_KEY=66e51aa0-180a-473d-b18c-2d0e9da1a0c9; Max-Age=2147483647; Expires=Tue, 11-Feb-2087 00:28:54 GMT; Path=/; Secure, Set-Cookie: JSESSIONID_8081=74348FC9E8998CCB94B3B12566B3FC11; Path=/; Secure; HttpOnly, X-Server-Name: apachenode01.liberty.edu, Keep-Alive: timeout=31, Connection: Keep-Alive, Transfer-Encoding: chunked, Vary: Accept-Encoding]
//	{"id":"166e567b-c43a-2253-0f17-5240e304c2a1","securityResourceId":"166e567b-c3a8-6eab-cf8e-ccd401a40927","name":"IS-AMQP-API","description":"Integration Services","created":1541447072292,"enforceCompleteSnapshots":false,"active":true,"tags":[{"id":"c6a6b8f0-1352-416c-99bb-387572dc5182","name":"Current IS Apps","color":"#48d1cc","description":"","objectType":"Application"}],"deleted":false,"user":"Tasker, Alex (Systems Verification & Testing) (atasker2)","componentCount":1,"extendedSecurity":{"read":true,"Create Applications":true,"Create Applications From Template":true,"Delete":true,"Edit Basic Settings":true,"Manage Blueprints":true,"Manage Components":true,"Manage Environments":true,"Manage Processes":true,"Manage Properties":true,"Manage Snapshots":true,"Manage Teams":true,"Run Component Processes":true,"View Applications":true,"teams":[{"teamId":"7541de71-bd7a-4115-9c57-e55543a89948","teamLabel":"IT Development","resourceTypeId":"20000000000000000000000000000100","resourceTypeName":"Application"},{"teamId":"bd8a0980-12c2-4607-bab9-a05eba3ae6cf","teamLabel":"Deployment Team","resourceTypeId":"20000000000000000000000000000100","resourceTypeName":"Application"}]},"propSheet":{"id":"166e567b-c459-2f96-5960-8c52807d9e4a","path":"applications\/166e567b-c43a-2253-0f17-5240e304c2a1\/propSheet","version":1,"versionCount":1,"commit":198662,"versioned":true},"templatePropSheet":{"id":"166e567b-c465-24d0-6e5e-ab0ebd4233e6","name":"template","path":"applications\/166e567b-c43a-2253-0f17-5240e304c2a1\/templatePropSheet","version":1,"versionCount":1,"commit":198662,"versioned":true},"properties":[]}


}
