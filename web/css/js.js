/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// Toast Notification
$(window).load(function() {
  setTimeout(function() {
    Materialize.toast('<span>Hiya! I am a toast.</span>', 1500);
  }, 1500);
  setTimeout(function() {
    Materialize.toast('<span>You can swipe me too!</span>', 3000);
  }, 5000);
  setTimeout(function() {
    Materialize.toast('<span>You have new order.</span><a class="btn-flat yellow-text" href="#">Read<a>', 3000);
  }, 15000);
});

$(function() {
  // Google Maps  
  $('#map-canvas').addClass('loading');
  var latlng = new google.maps.LatLng(40.6700, -73.9400); // Set your Lat. Log. New York
  var settings = {
    zoom: 10,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP,
    mapTypeControl: false,
    scrollwheel: false,
    draggable: true,
    styles: [{
      "featureType": "landscape.natural",
      "elementType": "geometry.fill",
      "stylers": [{
        "visibility": "on"
      }, {
        "color": "#e0efef"
      }]
    }, {
      "featureType": "poi",
      "elementType": "geometry.fill",
      "stylers": [{
        "visibility": "on"
      }, {
        "hue": "#1900ff"
      }, {
        "color": "#c0e8e8"
      }]
    }, {
      "featureType": "road",
      "elementType": "geometry",
      "stylers": [{
        "lightness": 100
      }, {
        "visibility": "simplified"
      }]
    }, {
      "featureType": "road",
      "elementType": "labels",
      "stylers": [{
        "visibility": "off"
      }]
    }, {
      "featureType": "transit.line",
      "elementType": "geometry",
      "stylers": [{
        "visibility": "on"
      }, {
        "lightness": 700
      }]
    }, {
      "featureType": "water",
      "elementType": "all",
      "stylers": [{
        "color": "#7dcdcd"
      }]
    }],
    mapTypeControlOptions: {
      style: google.maps.MapTypeControlStyle.DROPDOWN_MENU
    },
    navigationControl: false,
    navigationControlOptions: {
      style: google.maps.NavigationControlStyle.SMALL
    },
  };
  var map = new google.maps.Map(document.getElementById("map-canvas"), settings);

  google.maps.event.addDomListener(window, "resize", function() {
    var center = map.getCenter();
    google.maps.event.trigger(map, "resize");
    map.setCenter(center);
    $('#map-canvas').removeClass('loading');
  });

  var contentString =
    '<div id="info-window">' +
    '<p>18 McLuice Road, Vellyon Hills,<br /> New York, NY 10010<br /><a href="https://plus.google.com/102896039836143247306/about?gl=za&hl=en" target="_blank">Get directions</a></p>' +
    '</div>';
  var infowindow = new google.maps.InfoWindow({
    content: contentString
  });

  var companyImage = new google.maps.MarkerImage('http://demo.geekslabs.com/ashoka/images/map-marker.png',
    new google.maps.Size(36, 62), // Width and height of the marker
    new google.maps.Point(0, 0),
    new google.maps.Point(18, 52) // Position of the marker 
  );

  var companyPos = new google.maps.LatLng(40.6700, -73.9400);

  var companyMarker = new google.maps.Marker({
    position: companyPos,
    map: map,
    icon: companyImage,
    title: "Shapeshift Interactive",
    zIndex: 3
  });

  google.maps.event.addListener(companyMarker, 'click', function() {
    infowindow.open(map, companyMarker);
    pageView('/#address');
  });
});

/*================================================================================
  Item Name: Materialize - Material Design Admin Template
  Version: 2.1
  Author: GeeksLabs
  Author URL: http://www.themeforest.net/user/geekslabs
================================================================================*/

$(function() {

  "use strict";

  var window_width = $(window).width();

  /*Preloader*/
  $(window).load(function() {
    setTimeout(function() {
      $('body').addClass('loaded');
    }, 200);
  });

  // Search class for focus
  $('.header-search-input').focus(
    function() {
      $(this).parent('div').addClass('header-search-wrapper-focus');
    }).blur(
    function() {
      $(this).parent('div').removeClass('header-search-wrapper-focus');
    });

  // Check first if any of the task is checked
  $('#task-card input:checkbox').each(function() {
    checkbox_check(this);
  });

  // Task check box
  $('#task-card input:checkbox').change(function() {
    checkbox_check(this);
  });

  // Check Uncheck function
  function checkbox_check(el) {
    if (!$(el).is(':checked')) {
      $(el).next().css('text-decoration', 'none'); // or addClass            
    } else {
      $(el).next().css('text-decoration', 'line-through'); //or addClass
    }
  }

  /*----------------------
  * Plugin initialization
  ------------------------*/

  // Materialize Slider
  $('.slider').slider({
    full_width: true
  });

  // Materialize Dropdown
  $('.dropdown-button').dropdown({
    inDuration: 300,
    outDuration: 125,
    constrain_width: true, // Does not change width of dropdown to that of the activator
    hover: false, // Activate on click
    alignment: 'left', // Aligns dropdown to left or right edge (works with constrain_width)
    gutter: 0, // Spacing from edge
    belowOrigin: true // Displays dropdown below the button
  });

  // Materialize Tabs
  $('.tab-demo').show().tabs();
  $('.tab-demo-active').show().tabs();

  // Materialize Parallax
  $('.parallax').parallax();
  $('.modal-trigger').leanModal();

  // Materialize scrollSpy
  $('.scrollspy').scrollSpy();

  // Materialize tooltip
  $('.tooltipped').tooltip({
    delay: 50
  });

  // Materialize sideNav  

  //Main Left Sidebar Menu
  $('.sidebar-collapse').sideNav({
    edge: 'left', // Choose the horizontal origin    
  });

  // FULL SCREEN MENU (Layout 02)
  $('.menu-sidebar-collapse').sideNav({
    menuWidth: 240,
    edge: 'left', // Choose the horizontal origin     
    //defaultOpen:true // Set if default menu open is true
  });

  // HORIZONTAL MENU (Layout 03)
  $('.dropdown-menu').dropdown({
    inDuration: 300,
    outDuration: 225,
    constrain_width: false, // Does not change width of dropdown to that of the activator
    hover: true, // Activate on hover
    gutter: 0, // Spacing from edge
    belowOrigin: true // Displays dropdown below the button
  });

  //Main Left Sidebar Chat
  $('.chat-collapse').sideNav({
    menuWidth: 300,
    edge: 'right',
  });
  $('.chat-close-collapse').click(function() {
    $('.chat-collapse').sideNav('hide');
  });
  $('.chat-collapsible').collapsible({
    accordion: false // A setting that changes the collapsible behavior to expandable instead of the default accordion style
  });

  // Pikadate datepicker
  $('.datepicker').pickadate({
    selectMonths: true, // Creates a dropdown to control month
    selectYears: 15 // Creates a dropdown of 15 years to control year
  });

  // Perfect Scrollbar
  $('select').not('.disabled').material_select();
  var leftnav = $(".page-topbar").height();
  var leftnavHeight = window.innerHeight - leftnav;
  $('.leftside-navigation').height(leftnavHeight).perfectScrollbar({
    suppressScrollX: true
  });
  var righttnav = $("#chat-out").height();
  $('.rightside-navigation').height(righttnav).perfectScrollbar({
    suppressScrollX: true
  });

  // Fullscreen
  function toggleFullScreen() {
    if ((document.fullScreenElement && document.fullScreenElement !== null) ||
      (!document.mozFullScreen && !document.webkitIsFullScreen)) {
      if (document.documentElement.requestFullScreen) {
        document.documentElement.requestFullScreen();
      } else if (document.documentElement.mozRequestFullScreen) {
        document.documentElement.mozRequestFullScreen();
      } else if (document.documentElement.webkitRequestFullScreen) {
        document.documentElement.webkitRequestFullScreen(Element.ALLOW_KEYBOARD_INPUT);
      }
    } else {
      if (document.cancelFullScreen) {
        document.cancelFullScreen();
      } else if (document.mozCancelFullScreen) {
        document.mozCancelFullScreen();
      } else if (document.webkitCancelFullScreen) {
        document.webkitCancelFullScreen();
      }
    }
  }

  $('.toggle-fullscreen').click(function() {
    toggleFullScreen();
  });

  // Floating-Fixed table of contents (Materialize pushpin)
  if ($('nav').length) {
    $('.toc-wrapper').pushpin({
      top: $('nav').height()
    });
  } else if ($('#index-banner').length) {
    $('.toc-wrapper').pushpin({
      top: $('#index-banner').height()
    });
  } else {
    $('.toc-wrapper').pushpin({
      top: 0
    });
  }

  // Toggle Flow Text
  var toggleFlowTextButton = $('#flow-toggle')
  toggleFlowTextButton.click(function() {
    $('#flow-text-demo').children('p').each(function() {
      $(this).toggleClass('flow-text');
    })
  });

  //Toggle Containers on page
  var toggleContainersButton = $('#container-toggle-button');
  toggleContainersButton.click(function() {
    $('body .browser-window .container, .had-container').each(function() {
      $(this).toggleClass('had-container');
      $(this).toggleClass('container');
      if ($(this).hasClass('container')) {
        toggleContainersButton.text("Turn off Containers");
      } else {
        toggleContainersButton.text("Turn on Containers");
      }
    });
  });

  // Detect touch screen and enable scrollbar if necessary
  function is_touch_device() {
    try {
      document.createEvent("TouchEvent");
      return true;
    } catch (e) {
      return false;
    }
  }
  if (is_touch_device()) {
    $('#nav-mobile').css({
      overflow: 'auto'
    })
  }

  //LINE CHART WITH AREA IN SIDEBAR
  new Chartist.Line('#ct2-chart', {
    labels: [1, 2, 3, 4, 5, 6, 7, 8],
    series: [
      [5, 9, 7, 8, 5, 3, 5, 4]
    ]
  }, {
    low: 0,
    showArea: true
  });

  //Trending chart for small screen
  if (window_width <= 480) {
    $("#trending-line-chart").attr({
      height: '200'
    });
  }

}); // end of document ready