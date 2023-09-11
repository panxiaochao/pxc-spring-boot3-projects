package pxc.spring.boot3.handle;


import io.github.panxiaochao.spring3.operate.log.core.domain.OperateLogDomain;
import io.github.panxiaochao.spring3.operate.log.core.handler.AbstractOperateLogHandler;
import jakarta.annotation.Resource;
import pxc.spring.boot3.service.HandlerService;


/**
 * {@code OperateLogHandler}
 * <p>
 *
 * @author Lypxc
 * @since 2023-07-03
 */
// @Component
public class OperateLogHandler extends AbstractOperateLogHandler {

    @Resource
    private HandlerService handlerService;

    @Override
    public void saveOperateLog(OperateLogDomain operateLogDomain) {
        logger.info("OperateLog Db");
        handlerService.hello();
    }
}
