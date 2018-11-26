package s_lix.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import s_lix.dao.ItemsDao;
import s_lix.domain.Items;
import s_lix.service.ItemsService;

@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    public Items findOneById(int id) {
        return itemsDao.findOneById(id);
    }
}
