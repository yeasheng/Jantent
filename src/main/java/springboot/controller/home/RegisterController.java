package springboot.controller.home;

import com.github.pagehelper.PageInfo;
import com.vdurmont.emoji.EmojiParser;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import springboot.constant.WebConst;
import springboot.controller.AbstractController;
import springboot.controller.helper.ExceptionHelper;
import springboot.dto.MetaDto;
import springboot.dto.Types;
import springboot.exception.TipException;
import springboot.modal.bo.ArchiveBo;
import springboot.modal.bo.CommentBo;
import springboot.modal.bo.RestResponseBo;
import springboot.modal.vo.CommentVo;
import springboot.modal.vo.ContentVo;
import springboot.modal.vo.MetaVo;
import springboot.service.ICommentService;
import springboot.service.IContentService;
import springboot.service.IMetaService;
import springboot.service.ISiteService;
import springboot.util.IpUtil;
import springboot.util.MyUtils;
import springboot.util.PatternKit;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;

/**
 * 注册控制
 *
 * @author yansheng
 * @date 2018/9/24 9:47
 */
@Controller
@RequestMapping("/register")
@Transactional(rollbackFor = TipException.class)
public class RegisterController extends AbstractController {
    private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @Autowired
    private IContentService contentService;

    @Autowired
    private ICommentService commentService;

    @Resource
    private IMetaService metaService;

    @Resource
    private ISiteService siteService;




}
