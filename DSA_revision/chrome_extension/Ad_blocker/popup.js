document.addEventListener('DOMContentLoaded', () => {
  const toggleButton = document.getElementById('toggleButton');

  chrome.storage.local.get('adBlockEnabled', (data) => {
    const enabled = data.adBlockEnabled ?? true;
    toggleButton.textContent = enabled ? 'Disable Ad Block' : 'Enable Ad Block';
  });

  toggleButton.addEventListener('click', () => {
    chrome.storage.local.get('adBlockEnabled', (data) => {
      const enabled = !(data.adBlockEnabled ?? true);
      chrome.storage.local.set({ adBlockEnabled: enabled });
      toggleButton.textContent = enabled ? 'Disable Ad Block' : 'Enable Ad Block';
    });
  });
});
