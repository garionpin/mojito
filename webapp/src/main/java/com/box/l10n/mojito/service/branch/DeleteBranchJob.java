package com.box.l10n.mojito.service.branch;

import com.box.l10n.mojito.quartz.QuartzPollableJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/** @author jaurambault */
@Component
public class DeleteBranchJob extends QuartzPollableJob<DeleteBranchJobInput, Void> {

  /** logger */
  static Logger logger = LoggerFactory.getLogger(DeleteBranchJob.class);

  @Autowired private DeleteBranchService deleteBranchService;

  @Override
  public Void call(DeleteBranchJobInput input) throws Exception {
    logger.debug("DeleteAssetsOfBranchJob");
    deleteBranchService.deleteBranch(input.getRepositoryId(), input.getBranchId());
    return null;
  }
}
