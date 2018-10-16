package com.blade.demo.upload;

import com.blade.mvc.Const;
import com.blade.mvc.annotation.*;
import com.blade.mvc.multipart.FileItem;
import com.blade.mvc.ui.RestResponse;

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

    @GetRoute
    public String index() {
        return "upload.html";
    }

    @PostRoute("upload")
    @JSON
    public RestResponse<?> doUpload(@MultipartParam FileItem fileItem) throws IOException {
        if (null != fileItem) {
            fileItem.moveTo(Paths.get(Const.CLASSPATH + "/upload/" + fileItem.getFileName()));
            return RestResponse.ok();
        }
        return RestResponse.fail("没有文件上传");
    }

}
