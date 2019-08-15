/*  layui.config({
      base: '/lib/'
  }).extend({
      ckplayer: 'ckplayer/ckplayer'
  }).use(['jquery', 'ckplayer'], function() {

      var $ = layui.$,
          ckplayer = layui.ckplayer;
      var vUrl = $('#video').data('url'),
          videoObject = {
              container: '#video',
              loop: true,
              autoplay: true,
              video: [
                  [vUrl, 'video/mp4']
              ]
          };
      var player = new ckplayer(videoObject);
  });*/
/*$('.submit').click(function () {
    var formData = new FormData();

    formData.append("crowd_file",$('#crowd_file')[0].files[0]);
    formData.append("videoName","曹操发的一个小视频");
    formData.append("userId","7sk65d23fjklj34412");
    $.ajax({
        url:'/upload/',
        dataType:'json',
        type:'POST',
        async: false,
        data: formData,
        processData : false, // 使数据不做处理
        contentType : false, // 不要设置Content-Type请求头
        success: function(data){
            console.log(data);
            if (data.status == 'ok') {
                alert('上传成功！');
            }

        },
        error:function(response){
            console.log(response);
        }
    });

})*/