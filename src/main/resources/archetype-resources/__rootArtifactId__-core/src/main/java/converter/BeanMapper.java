#set($symbol_pound='#')
#set($symbol_dollar='$')
#set($symbol_escape='\' )
package ${package}.converter;

import org.mapstruct.Mapper;

/**
 * @author: frank.huang
 * @date: 2023-02-25 12:29
 */
@Mapper(componentModel = "spring")
public interface BeanMapper {
}