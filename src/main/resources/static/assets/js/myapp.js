$(function(){
    var products=[
        ['1', 'ABC'],
        ['2', 'XYS'],
        ['3', 'ASD'],
        ['4', 'GHJ'],
        ['5', 'KLM'],
        ['6', 'NOM'],
        ['7', 'QWE'],
        ['8', 'RTY'],
        ['9', 'BNM']
    ];

    var $table = $('#productListTable');

    if($table.length){
        //console.log('asdfdfd');
        $table.DataTable({
           data:products
        });
    }

});