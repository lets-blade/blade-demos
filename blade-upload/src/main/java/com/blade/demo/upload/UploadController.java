package com.blade.demo.upload;

import com.blade.mvc.Const;
import com.blade.mvc.annotation.*;
import com.blade.mvc.multipart.FileItem;
import com.blade.mvc.ui.RestResponse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
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
    public RestResponse<?> doUpload(@MultipartParam FileItem fileItem) {
        if (null != fileItem) {
            byte[] data = fileItem.getData();
            // Save the temporary file to the specified path
            try {
                Files.write(Paths.get(Const.CLASSPATH + "/upload/" + fileItem.getFileName()), data);
                return RestResponse.ok();
            } catch (IOException e) {
                e.printStackTrace();
                return RestResponse.fail(e.getMessage());
            }
        }
        return RestResponse.ok();
    }

}
