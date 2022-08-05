(() => {
    "use strict";

    const fetchTest = () => {
        console.log('Fetching from server...');

        const serverUrl = 'http://localhost:8090/fetch-test'
        fetch(serverUrl)
            .then((response) => response.json())
            .then((json) => {
                console.log('Fetch finished with success!', json);
                const fetchSpan = document.querySelector('#fetch-result');
                if (fetchSpan) {
                    fetchSpan.innerHTML = JSON.stringify(json);
                }
            })
            .catch((error) => {
                console.error('Oops!', error);
            });
    };

    fetchTest();
})();