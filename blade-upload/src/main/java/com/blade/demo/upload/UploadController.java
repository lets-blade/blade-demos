package com.blade.demo.upload;

import com.hellokaton.blade.annotation.Path;
import com.hellokaton.blade.annotation.request.Multipart;
import com.hellokaton.blade.annotation.route.GET;
import com.hellokaton.blade.annotation.route.POST;
import com.hellokaton.blade.kit.BladeKit;
import com.hellokaton.blade.mvc.multipart.FileItem;
import com.hellokaton.blade.mvc.ui.RestResponse;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * 上传文件控制器
 *
 * @author biezhi
 * @date 2017/10/1
 */
@Path
public class UploadController {

    @GET
    public String index() {
        return "upload.html";
    }

    @POST("upload")
    public RestResponse<?> doUpload(@Multipart FileItem fileItem) throws IOException {
        if (null != fileItem) {
            fileItem.moveTo(Paths.get(BladeKit.getCurrentClassPath() + "/upload/" + fileItem.getFileName()));
            return RestResponse.ok();
        }
        return RestResponse.fail("没有文件上传");
    }

}
