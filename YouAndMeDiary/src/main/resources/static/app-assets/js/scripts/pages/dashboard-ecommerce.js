/*=========================================================================================
    File Name: advance-cards.js
    Description: intialize advance cards
    ----------------------------------------------------------------------------------------
    Item Name: Stack - Responsive Admin Theme
    Author: PIXINVENT
    Author URL: http://www.themeforest.net/user/pixinvent
==========================================================================================*/
    // Area chart
// ------------------------------
$(window).on("load", function(){
    var recent_buyers = new PerfectScrollbar("#recent-buyers", {
        wheelPropagation: false
     });
    /********************************************
    *               PRODUCTS SALES              *
    ********************************************/

    var months = ["1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"];
    Morris.Line({
        element: 'products-sales',
        data: [{
            month: '2020-01',
            diary: 30,
            picture: 50,
        }, {
            month: '2020-02',
            diary: 40,
            picture: 30,
        }, {
            month: '2020-03',
            diary: 0,
            picture: 0,
        }, {
            month: '2020-04',
            diary: 0,
            picture: 0,
        }, {
            month: '2020-05',
            diary: 0,
            picture: 0,
        }, {
            month: '2020-06',
            diary: 0,
            picture: 0,
        }, {
            month: '2020-07',
            diary: 0,
            picture: 0,
        },{
            month: '2020-08',
            diary: 0,
            picture: 0,
        },{
            month: '2020-09',
            diary: 0,
            picture: 0,
        },{
            month: '2020-10',
            diary: 0,
            picture: 0,
        },{
            month: '2020-11',
            diary: 0,
            picture: 0,
        },{
            month: '2020-12',
            diary: 0,
            picture: 0,
        }],
        xkey: 'month',
        ykeys: ['diary', 'picture'],
        labels: ['일기', '사진'],
        xLabelFormat: function(x) { // <--- x.getMonth() returns valid index
            var month = months[x.getMonth()];
            return month;
        },
        dateFormat: function(x) {
            var month = months[new Date(x).getMonth()];
            return month;
        },
        behaveLikeLine: true,
        ymax: 100,
        resize: true,
        pointSize: 0,
        pointStrokeColors:['#00B5B8', '#FA8E57'],
        smooth: true,
        gridLineColor: '#E4E7ED',
        numLines: 6,
        gridtextSize: 14,
        lineWidth: 3,
        fillOpacity: 0.9,
        hideHover: 'auto',
        lineColors: ['#00B5B8', '#FA8E57']
    });
    
    /********************************************
    *               Monthly Sales               *
    ********************************************/
    Morris.Bar.prototype.fillForSeries = function(i) {
      var color;
      return "0-#fff-#f00:20-#000";
    };

    Morris.Bar({
        element: 'monthly-sales',
        data: [{month: 'Jan', sales: 1835 }, {month: 'Feb', sales: 2356 }, {month: 'Mar', sales: 1459 }, {month: 'Apr', sales: 1289 }, {month: 'May', sales: 1647 }, {month: 'Jun', sales: 2156 }, {month: 'Jul', sales: 1835 }, {month: 'Aug', sales: 2356 }, {month: 'Sep', sales: 1459 }, {month: 'Oct', sales: 1289 }, {month: 'Nov', sales: 1647 }, {month: 'Dec', sales: 2156 }],
        xkey: 'month',
        ykeys: ['sales'],
        labels: ['Sales'],
        barGap: 4,
        barSizeRatio: 0.3,
        gridTextColor: '#bfbfbf',
        gridLineColor: '#E4E7ED',
        numLines: 5,
        gridtextSize: 14,
        resize: true,
        barColors: ['#00B5B8'],
        hideHover: 'auto',
    });
    
    /************************************************************
    *               Social Cards Content Slider                 *
    ************************************************************/
    // RTL Support
    var rtl = false;
    if($('html').data('textdirection') == 'rtl'){
        rtl = true;
    }
    if(rtl === true)
        $(".tweet-slider").attr('dir', 'rtl');
    if(rtl === true)
        $(".fb-post-slider").attr('dir', 'rtl');

    // Tweet Slider
    $(".tweet-slider").unslider({
        autoplay: true,
        delay:3500,
        arrows: false,
        nav: false,
        infinite: true
    });

    // FB Post Slider
    $(".fb-post-slider").unslider({
        autoplay: true,
        delay:4500,
        arrows: false,
        nav: false,
        infinite: true
    });
});