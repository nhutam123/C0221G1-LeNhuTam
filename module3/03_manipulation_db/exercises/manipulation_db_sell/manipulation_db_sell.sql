use manage_customer;
select * from customer;

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select   co.order_id , co.order_date , sum(od.odqty*p.product_price) 
from customer_order co 
	join order_detail od on co.order_id = od.order_id
	join product p on od.product_id=p.product_id
    join customer c on co.customer_id=c.customer_id
group by co.order_id;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select c.customer_name,p.product_name
from customer c 
	join customer_order co on c.customer_id=co.customer_id
    join order_detail od on co.order_id=od.order_id
    join product p on od.product_id=p.product_id;
    
-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào 
select  *
from customer c
	left join customer_order co on c.customer_id=co.customer_id
where co.customer_id is null;

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn
select co.order_id,co.order_date,sum(p.product_price*od.odqty)
from customer_order co 
	join order_detail od on co.order_id=od.order_id
    join product p on od.product_id=p.product_id
group by co.order_id;



