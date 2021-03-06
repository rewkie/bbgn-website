package tv.bbgn.bbgnwebsite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tv.bbgn.bbgnwebsite.models.NewsItem;

@Repository
public interface NewsItemsRepository extends CrudRepository<NewsItem, Long>{

}
