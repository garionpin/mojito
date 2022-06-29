package com.box.l10n.mojito.service.pushrun;

import com.box.l10n.mojito.entity.PushRunAsset;
import com.box.l10n.mojito.entity.PushRunAssetTmTextUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author garion
 */
@RepositoryRestResource(exported = false)
public interface PushRunAssetTmTextUnitRepository extends JpaRepository<PushRunAssetTmTextUnit, Long> {

    @Transactional
    void deleteByPushRunAsset(PushRunAsset pushRunAsset);

    Optional<PushRunAssetTmTextUnit> findFirstByPushRunAsset(PushRunAsset pushRunAsset);

    List<PushRunAssetTmTextUnit> findByPushRunAsset(PushRunAsset pushRunAsset);
}
