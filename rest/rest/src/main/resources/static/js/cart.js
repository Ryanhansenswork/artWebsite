function upadateCaseNumber(product, price, isIncreasing){
    const caseInput = document.getElementById(product + '-number');
    let caseNumber = caseInput.value;
            if(isIncreasing){
                caseNumber = parseInt(caseNumber) + 1;
            }
            
    else if(caseNumber > 0){
           caseNumber = parseInt(caseNumber) - 1;
         }
        
        caseInput.value = caseNumber;
    // update case total 
    const caseTotal = document.getElementById(product + '-total');
    caseTotal.innerText = caseNumber * price;
    calculateTotal();
    }


    function getInputvalue(product){
        const productInput = document.getElementById(product + '-number');
        const productNumber = parseInt(productInput.value);
        return productNumber;
    }
    function calculateTotal(){
        const phoneTotal = getInputvalue('phone') * 1219;
        const caseTotal = getInputvalue('case') * 59;
        const subTotal = phoneTotal + caseTotal;
        const tax = subTotal / 10;
        const totalPrice = subTotal + tax;

        // update on the html 
        document.getElementById('sub-total').innerText = subTotal;
        document.getElementById('tax-amount').innerText = tax;
        document.getElementById('total-price').innerText = totalPrice;

    }





document.getElementById('case-plus').addEventListener('click',function(){
        // const caseInput = document.getElementById('case-number');
        // const caseNumber = caseInput.value;
        // caseInput.value = parseInt(caseNumber) + 1;
   upadateCaseNumber('case', 59 ,true);
});

document.getElementById('case-minus').addEventListener('click',function(){
    // const caseInput = document.getElementById('case-number');
//     const caseNumber = caseInput.value;
//    if(caseInput.value > 1){
//         caseInput.value = parseInt(caseNumber) - 1;
//    }
upadateCaseNumber('case', 59, false);
});

// phone prcie update using add event linstner 
document.getElementById('phone-plus').addEventListener('click',function(){
    upadateCaseNumber('phone',1219, true);
});


document.getElementById('phone-minus').addEventListener('click',function(){
    upadateCaseNumber('phone',1219 , false);
});
document.addEventListener("DOMContentLoaded", () => {
    fetchCartItems();
});

function fetchCartItems() {
    fetch('/api/cart')
        .then(response => response.json())
        .then(data => {
            const cartTable = document.querySelector('.cart-page table');
            let cartRows = "";

            data.forEach(item => {
                cartRows += `
                <tr>
                    <td>
                        <div class="cart-info">
                            <img src="data:image/jpeg;base64,${item.cartProductImage}" alt="${item.cartProduct}">
                            <div>
                                <p>${item.cartProduct}</p>
                                <small>Price: $${item.price}</small>
                                <br>
                                <a href="#" class="remove-item" data-id="${item.cartId}">Remove</a>
                            </div>
                        </div>
                    </td>
                    <td><input type="number" value="1"></td>
                    <td>$${item.price}</td>
                </tr>`;
            });

            // Insert rows into the table
            cartTable.innerHTML += cartRows;

            // Add event listeners to "Remove" links
            document.querySelectorAll(".remove-item").forEach(link => {
                link.addEventListener("click", (e) => {
                    e.preventDefault();
                    const cartId = link.dataset.id;
                    removeCartItem(cartId);
                });
            });
        })
        .catch(error => console.error("Error fetching cart items:", error));
}

function removeCartItem(cartId) {
    fetch(`/api/cart/${cartId}`, {
        method: 'DELETE'
    })
    .then(response => {
        if (response.ok) {
            alert("Item removed from cart");
            location.reload(); // Reload the page to reflect changes
        } else {
            throw new Error("Failed to remove item");
        }
    })
    .catch(error => console.error("Error removing item:", error));
}
